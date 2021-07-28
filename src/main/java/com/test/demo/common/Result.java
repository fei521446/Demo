package com.test.demo.common;

import lombok.Data;

/**
 * @Author:fhl
 * @Describtion
 * @Date:2021/7/10 18:59
 */
@Data
public class Result {

    private int code;// 200是正常，非200表示异常
    private String msg;
    private Object data;

    public Result result(int code,String msg,Object data){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
