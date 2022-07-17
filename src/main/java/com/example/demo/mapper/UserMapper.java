package com.example.demo.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 赖俊嘉
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-04-05 11:07:54
* @Entity com.example.demo.entity.User
*/
public interface UserMapper extends BaseMapper<User> {


    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}




