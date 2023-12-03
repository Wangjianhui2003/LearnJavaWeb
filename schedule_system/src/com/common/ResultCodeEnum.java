package com.common;

public enum ResultCodeEnum {
    SUCCESS(200,"success"),
    USERNAME_ERROR(501,"username error"),
    PASSWORD_ERROR(503,"password error"),
    NOTLOGIN(504,"not login in"),
    USERNAME_USED(505,"username used");

    private Integer code;
    private String message;
    private ResultCodeEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
