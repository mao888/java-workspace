package com.mao.dao;

public class UserDaoSqlServer implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SqlServer获取用户数据！");
    }
}
