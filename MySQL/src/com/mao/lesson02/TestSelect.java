package com.mao.lesson02;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();//获取连接
            st = conn.createStatement();//获取SQL执行对象

            String sql = "select * from users";     //SQL
            rs=st.executeQuery(sql);//查询完毕返回结果集

            while (rs.next()){
                System.out.println(rs.getString("NAME"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}
