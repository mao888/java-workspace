package com.mao.dao;

import com.mao.pojo.User;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserId(){
        SqlSession session = MybatisUtils.getSession(); //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.SelectUserById(1);
        System.out.println(user);
        session.close();
    }





}
