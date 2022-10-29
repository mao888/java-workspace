package com.mao.lesson03;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement st = null;

        try {
            conn=JdbcUtils.getConnection();

            String sql="update users set `NAME`=? where `id`=?";

            st=conn.prepareStatement(sql);

            st.setString(1,"胡超");
            st.setInt(2,1);

            int i = st.executeUpdate();
            if (i>0){
                System.out.println("更新成功！");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
