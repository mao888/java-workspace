package com.mao.lesson05.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils_DBCP {
    /*
    private  static String driver=null;
    private  static String url=null;
    private  static String username=null;
    private  static String password=null;
    */

    public static DataSource dataSource =null;

    static {

        try {
            InputStream in = JdbcUtils_DBCP.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
            Properties properties =new Properties();
            properties.load(in);    //加载到流里面

            /*  不需要再连接数据库
            driver=properties.getProperty("driver");
            url=properties.getProperty("url");

            username=properties.getProperty("username");
            password=properties.getProperty("password");
            */

            //1、驱动只用加载一次
//            Class.forName(driver);  驱动不需要再加载


            // 创建数据源  工厂模式 --> 创建
            dataSource= BasicDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        //获取连接
        public static Connection getConnection() throws SQLException {
            return dataSource.getConnection();  //从数据源中获取连接
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

}
