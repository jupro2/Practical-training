package com.example.backspring.util;

/**
 * @author 鞠国鹏
 * @Date 2024 07 2024/7/7
 */
public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(10000,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    SENSITIVE_DATA(4,"评论中含有敏感词汇")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}