package com.mao.lesson02;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_ZhuRu {
    public static void main(String[] args) {

        //SQL注入  没有登陆账户就将资料查询出来
        login("' or '1=1","123456");

//        login("huchao","123456");

    }

    public static void login(String username,String password){

        Connection conn=null;
        Statement st= null;
        ResultSet rs =null;

        try {
            conn= JdbcUtils.getConnection();  //获取数据库连接
            st = conn.createStatement();   //获得SQL的执行对象

            String sql= "SELECT * FROM users WHERE `Name`='"+username+"' AND `password`='"+password+"';";
//            String sql = "select * from users where `NAME`='"+ name +"'  AND `PASSWORD`='"+ password +"'" ;
            //            int i = st.executeUpdate(sql);

            rs = st.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getString("NAME"));
                System.out.println(rs.getString("PASSWORD"));
                System.out.println("==================================");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }



    }
}
