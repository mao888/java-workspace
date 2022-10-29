package com.mao.dao;

import com.mao.pojo.User;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getAllUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        List<User> allUser = mapper.getAllUser();
//        for (User user : allUser) {
//            System.out.println(user);
//        }

//        User user = mapper.selectUserById(1);
//        System.out.println(user);
        int user= mapper.deleteUser(7);
        if (user>0){
            System.out.println("修改成功");
        }

        session.close();
    }


}
