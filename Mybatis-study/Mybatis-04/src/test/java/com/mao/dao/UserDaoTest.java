package com.mao.dao;

import com.mao.pojo.User;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    //注意导包：org.apache.log4j.Logger
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Integer>map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);

       List<User> userList= mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserByRowBounds(){
        SqlSession session = MybatisUtils.getSession();
        //RowBounds
        RowBounds rowBounds = new RowBounds(1,2);
        //通过java代码层面实现分离
        List<User> userList = session.selectList("com.mao.dao.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserId(){
        SqlSession session = MybatisUtils.getSession(); //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.SelectUserById(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");
    }

}
