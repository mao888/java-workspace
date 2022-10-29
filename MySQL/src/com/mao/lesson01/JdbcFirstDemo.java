package com.mao.lesson01;

import java.sql.*;

// 我的第一个JDBC程序
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");  //固定写法

        //2.用户信息和url
        String url ="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&&useSSL=false";
        String username = "root";
        String password = "10428376";

        //3.连接成功，数据库对象  Connection 代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        /*
            //connection代表数据库
            //数据库设置自动提交
            connection.setAutoCommit();
            //事务提交
            connection.commit();
            //事务回滚
            connection.rollback();
        */

        //4.执行SQL对象  Statement 执行sql的对象
        Statement statement = connection.createStatement();

        /*
        statement.executeQuery(); //查询操作返回 ResultSet
        statement.execute();      // 执行任何SQL
        statement.executeUpdate();//更新，插入，删除，返回一个受影响的行数
        */

        //5.执行SQL的对象 去 执行SQL，可能存在结果，查看返回结果
        String sql = "SELECT * FROM users";

        ResultSet resultSet = statement.executeQuery(sql);//返回的结果集，结果集中封装了我们全部查询出来的结果

        /*
        获得指定的数据类型
        *ResultSet resultSet = statement.executeQuery(sql);//返回的结果集,结果集中封装了我们全部查询的结果
        resultSet.getObject();//在不知道列类型下使用
        *
        resultSet.getString();//如果知道则指定使用
        resultSet.getInt();
        * */

        /*
        * 遍历,指针
        * resultSet.previous();//移动到前一行
        resultSet.next(); //移动到下一个
        resultSet.beforeFirst();//移动到最前面
        resultSet.afterLast();//移动到最后
        resultSet.absolute(row);//移动到指定行
        * */

        while (resultSet.next()){
            System.out.println("id:"+resultSet.getObject("id"));
            System.out.println("name:"+resultSet.getObject("NAME"));
            System.out.println("pwd:"+resultSet.getObject("PASSWORD"));
            System.out.println("emil:"+resultSet.getObject("email"));
            System.out.println("birth:"+resultSet.getObject("birthday"));
            System.out.println("==========================================");
        }
        //6.释放连接
        // 释放内存
        resultSet.close();
        statement.close();
        connection.close(); //耗资源
    }

}
