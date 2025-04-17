package com.rainbowsea.usercenter.service;


import com.rainbowsea.usercenter.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.lang.String;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAdduser() {
        User user = new User();
        user.setUsername("dogYupi");
        user.setUserAccount("123");
        user.setAvatarUrl("https://profile-avatar.csdnimg.cn/2f8ef0ed68a647bcad04088152e00c69_weixin_61635597.jpg!1");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);


    }

    @org.junit.Test
    public void testDigest() {
        String newPassword = DigestUtils.md5DigestAsHex(("rainbowsea" + "123").getBytes());
        System.out.println(newPassword);
    }

    @org.junit.Test
    public void testMatches() {
        // 正则表达式匹配字母、数字、下划线
        String regex = "^[a-zA-Z0-9_]+$";
        System.out.println("889tttt!!!!".matches(regex));
        System.out.println("889tt".matches(regex));
    }


    @Test
    public void userRegister() {
        User user = new User();

        // 验证密码不为空
        String userAccount = "dogYupi";
        String userPassword = "";
        String checkPassword = "12345678";
        String plantCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 测试账户长度不能小于  4
        userAccount = "yu";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);


        // 验证账户不可以重复
        userAccount = "dogYupi";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);


        //  验证账户不包含特殊字符
        userAccount = "yu pi";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);


        // 验证密码和校验密码不一致
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 验证密码不小于 8 位
        userPassword = "123";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertEquals(-1, result);

        // 验证密码不为空
        userAccount = "rainbowsea";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        Assertions.assertTrue(result > 0);
        //Assertions.assertTrue( result > 0);

    }
}
