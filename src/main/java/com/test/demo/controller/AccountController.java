package com.test.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.demo.common.LoginDto;
import com.test.demo.common.Result;
import com.test.demo.entity.SysUser;
import com.test.demo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author fhl
 * @Describetion 登录接口
 * @Date 2021/7/29
 */
public class AccountController {

    @Autowired
    ISysUserService iSysUserService;

    @PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto){
        SysUser user = iSysUserService.getOne(new QueryWrapper<SysUser>().eq("loginname", loginDto.getLoginName()));
        Assert.notNull(user,"用户不存在");
        return null;
    }



}
