package com.rainbowsea.usercenter.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 通用返回类 ，返回给前端的报错，提示信息的类
 *
 * @param <T> data 返回的类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 7190730665908854521L;

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String description) {
        this(code, data, "", description);
    }


    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }





}
