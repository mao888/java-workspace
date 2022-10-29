package com.mao.lesson04;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestTransaction2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st =null;
        ResultSet rs = null;

        try {
            conn=JdbcUtils.getConnection();
            //关闭数据库的自动提交功能，开启事务
            conn.setAutoCommit(false);  //自动开启事务

            String sql1 = "update account set money=money-500 where NAME ='胡超'";
            st=conn.prepareStatement(sql1);
            st.executeUpdate();

            int x=1/0;

            String sql2 = "update account set money=money+500 where NAME ='三门峡'";
            st=conn.prepareStatement(sql2);
            st.executeUpdate();

            //业务完毕，提交事务
            conn.commit();
            System.out.println("转账成功！");

        } catch (SQLException throwables) {
            try {
                //默认回滚，可写可不写
                conn.rollback();    //如果失败则回滚事务
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}
