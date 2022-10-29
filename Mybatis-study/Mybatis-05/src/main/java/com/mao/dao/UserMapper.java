package com.mao.dao;

import com.mao.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询全部用户
    @Select("select id,name,pwd from user")
    public List<User> getAllUser();

    //根据id查询用户
    //方法存在多个参数，所有的参数前面必须加上@param("id")注解
    @Select("select * from user where id = #{id}")
    User selectUserById(@Param("id") int id);

    //添加一个用户
    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    //修改一个用户
    @Update("update user set name=#{name},pwd=#{password} where id = #{id}")
    int updateUser(User user);

    //根据id删除用
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid")int id);

}
