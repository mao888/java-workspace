package com.mao.Mapper;

import com.mao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //我们的所有操作，都使用sqlSession来执行，在原来，现在都使用SqlSessionTemplate;
    //sqlSession不用我们自己创建了，Spring来管理

    @Override
    public List<User> selectUser() {
        User user =new User(7,"凤凤","888888");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(6 );

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
