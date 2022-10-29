package com.mao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

    /**
     * Spring Boot 默认提供了数据源，默认提供了 org.springframework.jdbc.core.JdbcTemplate
     * JdbcTemplate 中会自己注入数据源，用于简化 JDBC操作
     * 还能避免一些常见的错误,使用起来也不用再自己来关闭数据库连接
     */

@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库的所有信息
    //没有实体类，数据库中的东西，怎么获取，用map

    //List 中的1个 Map 对应数据库的 1行数据
    //Map 中的 key 对应数据库的字段名，value 对应数据库的字段值
    @GetMapping("/userList")   //前端请求
    public List<Map<String,Object>> userList(){
        String sql = "select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }

    //新增一个用户
        @GetMapping("/add")
        public String addUser(){
            //插入语句，注意时间问题
            String sql = "insert into user (id, name ,pwd)" +
                    " values (6,'yuanyuan','123456')";
            jdbcTemplate.update(sql);
            //查询
            return "addOk";
        }

        //修改用户信息
        @GetMapping("/update/{id}")
        public String updateUser(@PathVariable("id") int id){
            //插入语句
            String sql = "update user set name =?,pwd=? where id="+id;
            //数据
            Object[] objects = new Object[2];
            objects[0] = "凤凤";
            objects[1] = "24736743";
            jdbcTemplate.update(sql,objects);
            //查询
            return "updateOk";
        }

        //删除用户
        @GetMapping("/delete/{id}")
        public String delUser(@PathVariable("id") int id){
            //插入语句
            String sql = "delete from user where id=?";
            jdbcTemplate.update(sql,id);
            //查询
            return "deleteOk";
        }
}
