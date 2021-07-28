package com.test.demo.shiro;

import cn.hutool.core.bean.BeanUtil;
import com.sun.org.apache.bcel.internal.classfile.Unknown;
import com.test.demo.entity.SysUser;
import com.test.demo.service.ISysUserService;
import com.test.demo.util.JwtUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:fhl
 * @Describtion
 * @Date:2021/7/10 18:59
 */
@Component
public class AccountRealm  extends AuthorizingRealm {

    @Autowired
    JwtUtils JwtUtils;

    @Autowired
    ISysUserService ISysUserService;


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        JwtToken jwtToken= (JwtToken)token;

       String userId= JwtUtils.getClaimByToken((String) jwtToken.getPrincipal()).getSubject();

        SysUser user = ISysUserService.getById(Long.valueOf(userId));

        if (user == null){
            throw  new UnknownAccountException("账户不存在");
        }

        if (user.getStatus() == -1){
            throw  new UnknownAccountException("账户已被锁定");
        }

        AccountProfile  profile =new AccountProfile();
        BeanUtil.copyProperties(user,profile);


        return new SimpleAuthenticationInfo(profile,jwtToken.getCredentials(),getName());
    }
}
