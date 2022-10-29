package com.mao.dao;

import com.mao.pojo.User;

import java.util.List;

public interface UserMapper {

    //根据id查询用户
    User SelectUserById(int id);

}
