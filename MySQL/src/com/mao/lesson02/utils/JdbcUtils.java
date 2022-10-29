package com.mao.lesson02.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private  static String driver=null;
    private  static String url=null;
    private  static String username=null;
    private  static String password=null;

    static {

        try {
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties =new Properties();
            properties.load(in);

            driver=properties.getProperty("driver");
            url=properties.getProperty("url");

            username=properties.getProperty("username");
            password=properties.getProperty("password");

            //1、驱动只用加载一次
            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        //获取连接
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, username, password);
        }

        //释放连接
        public static void release(Connection conn, Statement st, ResultSet rs){
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (st!=null){
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    public static void main(String[] args) {
        System.out.println(driver);
    }

}
