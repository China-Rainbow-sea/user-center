package com.rainbowsea.usercenter.mapper;

import com.rainbowsea.usercenter.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author huo
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2025-04-14 16:03:21
* @Entity com.rainbowsea.usercenter.model.User
*/

@Mapper
public interface UserMapper extends BaseMapper<User> {

}




