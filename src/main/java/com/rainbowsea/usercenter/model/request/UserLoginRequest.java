package com.rainbowsea.usercenter.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 用户登录请求体 用于封装用户发送的请求，将其转换为 Java对象使用
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 6657816552958065397L;

    private String userAccount;
    private String userPassword;
}
