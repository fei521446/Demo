package com.test.demo.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author:fhl
 * @Describtion
 * @Date:2021/7/10 18:59
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt){
        this.token=jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
