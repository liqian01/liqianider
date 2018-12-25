package com.newer.dao;

import com.newer.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from sys_user where username=#{userName}and password=#{password}")
    User findUser(@Param("userName" )String userName,@Param("password") String password);
}
