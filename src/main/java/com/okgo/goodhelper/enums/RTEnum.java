package com.okgo.goodhelper.enums;

import lombok.Getter;

@Getter
public enum RTEnum {

    ERROR_PARAM(10,"参数错误"),
    FAIL_OPERATION(11,"操作失败"),
    MISS_OPENID(12,"身份丢失"),
    VOTED(13,"已经反馈过了"),
    ERROR_PHONE(14,"手机号错误"),
    ERROR_ROLE(15,"用户角色错误"),
    REPEAT_PRODUCT(16,"商品重复"),
    PRICE_FAIL1(17,"前者的满不能大于后者的满"),
    PRICE_FAIL2(18,"满不能小于减"),
    FILD_EMAIL(19,"提现密码错误"),
    MISS_PRODUCT(20,"商品不存在"),
    ERROR_CAR(21,"购物车异常"),
    ;

    private int code;
    private String msg;

    private RTEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}