package com.mao.dao;

import com.mao.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //模糊查询
    List<User>getUserLike(String value);

    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User SelectUserById(int id);

    User getUserId(Map<String,Object>map);

    //insert一个用户
    int addUser(User user);

    //万能的Map
    int addUser2(Map<String,Object>map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
