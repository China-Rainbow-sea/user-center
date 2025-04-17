package com.rainbowsea.usercenter.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 用户注册请求体, 用于封装用户发送的请求，将其转换为 Java对象使用
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 504278674381074669L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    /**
     * 用户编号，用户注册时，可以自行设置用户编号
     */
    private String plantCode;

}
