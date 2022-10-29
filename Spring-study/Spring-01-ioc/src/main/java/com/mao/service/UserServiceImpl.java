package com.mao.service;

import com.mao.dao.UserDao;
import com.mao.dao.UserDaoImpl;


public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoImpl();    //将Dao引到service层
    private UserDao userDao;

    //利用set 进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();      //业务层调Dao层
    }
}
