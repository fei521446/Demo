package com.test.demo.controller;


import com.test.demo.common.Result;
import com.test.demo.entity.SysUser;
import com.test.demo.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fhl
 * @since 2021-07-28
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        SysUser user = iSysUserService.getById(1);
        return Result.succ(user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody SysUser user){
        return Result.succ(user);
    }

}
