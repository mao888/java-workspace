package com.mao.lesson03;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            conn=JdbcUtils.getConnection();

            String sql = "select * from users where id=? ";     //编写SQL

            st=conn.prepareStatement(sql);     //预编译
            st.setInt(1,1);    //传递参数
            rs=st.executeQuery();              //执行

            while (rs.next()){
                System.out.println(rs.getString("NAME"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
