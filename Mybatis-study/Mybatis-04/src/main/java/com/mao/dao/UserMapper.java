package com.mao.dao;

import com.mao.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据id查询用户
    User SelectUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);

    //选择全部用户RowBounds实现分页
    List<User> getUserByRowBounds();

}
