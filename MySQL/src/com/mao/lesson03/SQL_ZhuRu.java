package com.mao.lesson03;

import com.mao.lesson02.utils.JdbcUtils;

import java.sql.*;

public class SQL_ZhuRu {
    public static void main(String[] args) {

        //SQL注入
//        login("' or '1=1","123456");
         login("胡超","123456");
//           login("''or 1=1","123456");
    }

    public static void login(String username,String password){

        Connection conn=null;
        PreparedStatement st= null;
        ResultSet rs =null;

        try {
            conn= JdbcUtils.getConnection();  //获取数据库连接
//           PreparedStatement 防止SQL注入的本质，把传递进来的参数当作字符
//           假设其中存在转义字符，比如说 ` 会被直接转义
            String sql= "select * from users where `NAME`=? and `PASSWORD`=?";  //Mybatis
//            String sql = "select * from users where `NAME`='"+ name +"'  AND `PASSWORD`='"+ password +"'" ;
            //            int i = st.executeUpdate(sql);

            st = conn.prepareStatement(sql);   //获得SQL的执行对象

            st.setString(1,username);
            st.setString(2,password);

            rs = st.executeQuery();  //查询完毕会返回一个结果集

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
