package com.test.demo.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:fhl
 * @Describtion
 * @Date:2021/7/10 18:59
 */
@Data
public class AccountProfile implements Serializable {

    private Integer id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 状态
     */
    private Integer status;
}
