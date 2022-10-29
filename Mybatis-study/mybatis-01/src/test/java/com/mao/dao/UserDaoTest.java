package com.mao.dao;

import com.mao.pojo.User;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class UserDaoTest {

    @Test
    public void getUserId(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("胡%");
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void test(){

        //第一步，获得SqlSession
        SqlSession session = MybatisUtils.getSession();
        try {


            //方式二
            //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");

            //方式一：getMapper
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            session.close();
        }
    }

    @Test
    public void getUserById(){
        SqlSession session1 = MybatisUtils.getSession();

        UserMapper mapper = session1.getMapper(UserMapper.class);

        User user= mapper.SelectUserById(1);
        System.out.println(user);

        session1.close();
    }

    //增删改查需要提交事物
    @Test
    public void addUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(5,"圆圆","1478520"));
        if (i>0){
            System.out.println("插入成功！");
        }
        //提交事物重点!不写的话不会提交到数据库
        session.commit();
        session.close();
    }
    @Test
    public void addUser2(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Object>map= new HashMap<String,Object>();
        map.put("userid",6);
        map.put("username","超哥");
        map.put("password","456563");
        int i = mapper.addUser2(map);
        if (i>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        session.close();
    }
    @Test
    public void updateUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int dj = mapper.updateUser(new User(5, "dj", "789456"));
        if (dj>0)
        {
            System.out.println("修改成功！");
        }
        session.commit();
        session.close();
    }
    @Test
    public void deleteuser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        session.commit();
        session.close();

    }



}
