package com.mao.lesson05.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils_C3P0 {
    /*
    private  static String driver=null;
    private  static String url=null;
    private  static String username=null;
    private  static String password=null;
    */
    private static ComboPooledDataSource  dataSource =null;



    static {

        try {
            //xml配置文件不需要读取，会自动加载

            //创建数据源 工厂模式--》创建
            dataSource = new ComboPooledDataSource("MySQL");    //配置文件写法

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
