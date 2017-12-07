package com.lym.ssm.util;

/**
 * Created by dllo on 17/12/6.
 * 嗯，这是这个工程唯一的注释
 */

//自己写的！！！！！！
public class AjaxResult {

    private String code;
    private String msg;
    private Object data;


    public AjaxResult(Object data) {

        this.code="0";
        this.msg="成功";
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
