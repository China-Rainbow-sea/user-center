package com.rainbowsea.usercenter.common;


import lombok.Getter;

/**
 * 通用错误码，枚举类
 *
 * @author Rainbowsea
 */
@Getter
public enum ErrorCode {

    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NOT_ERROR(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", "");


    private final int code;


    /**
     * 状态码信息
     */
    private final String message;


    /**
     * 具体的错误信息描述
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    // 枚举类，不可以提供设置: set 方法,但可以提供 get 方法，也需要提供 get 方法
}
