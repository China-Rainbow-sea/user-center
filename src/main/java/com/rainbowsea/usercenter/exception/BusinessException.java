package com.rainbowsea.usercenter.exception;

import com.rainbowsea.usercenter.common.ErrorCode;
import lombok.Getter;


/**
 * 自定义异常类
 */
@Getter
public class BusinessException extends RuntimeException {

    private int code;

    private String message;

    private String description;

    public BusinessException(int code, String message, String description) {
        super(message);
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }


    public BusinessException(ErrorCode errorCode,String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }
}
