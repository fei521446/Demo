package com.test.demo.shiro;

import cn.hutool.http.server.HttpServerRequest;
import com.alibaba.druid.util.StringUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Author:fhl
 * @Describtion
 * @Date:2021/7/10 18:59
 */
@Component
public class JwtFilter extends AuthenticatingFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        HttpServerRequest request= (HttpServerRequest)servletRequest;
        String jwt=request.getHeader("Authorization");
        if (StringUtils.isEmpty(jwt)){
            return null;
        }
        return null;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }

}
