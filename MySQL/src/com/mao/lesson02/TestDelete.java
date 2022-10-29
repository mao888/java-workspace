package com.mao.lesson02;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st= null;
        ResultSet rs =null;

        try {
            conn= JdbcUtils.getConnection();  //获取数据库连接
            st = conn.createStatement();   //获得SQL的执行对象
            String sql="DELETE FROM users WHERE id = 5";
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("删除成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }
    }
}
