package com.okgo.goodhelper.pojo.nopojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class RTVO<T> {

    private int code;

    private String msg;

    private T data;


}