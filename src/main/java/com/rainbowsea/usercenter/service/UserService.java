package com.rainbowsea.usercenter.service;

import com.rainbowsea.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huo
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-04-14 16:03:21
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param plantCode 用户中心用户的编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String plantCode);


    /**
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request      请求
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     *
     * @param originUser 用户
     * @return 返回脱敏后的安全用户User 对象
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销，移除 session 会话当中存储的用户态信息
     * @param request
     * @return 返回 1 表示注销成功
     */
    int userLogout(HttpServletRequest request);
}
