package com.mao.Mapper;

import com.mao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {

        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
