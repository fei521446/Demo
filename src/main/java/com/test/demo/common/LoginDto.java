package com.test.demo.common;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author fhl
 * @Describetion
 * @Date 2021/7/29
 */
@Data
public class LoginDto implements Serializable {
    /**
     * 登录名
     */
    @NotBlank(message="昵称不能为空")
    private String loginName;
}
