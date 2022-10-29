package com.mao.lesson02;

import com.mao.lesson02.utils.JdbcUtils;
//import jdk.nashorn.internal.ir.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st= null;
        ResultSet rs =null;

        try {
            conn=JdbcUtils.getConnection();  //获取数据库连接
            st = conn.createStatement();   //获得SQL的执行对象
            String sql="INSERT INTO `users`(id,NAME,PASSWORD,email,birthday)" +
                    "VALUES(5,'sanmenxia','123456','2557523039@qq.com','2000-02-01')";
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("插入成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }
    }
}
