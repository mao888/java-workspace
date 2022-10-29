package com.mao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
//实体类
@AllArgsConstructor
@NoArgsConstructor
@Alias("hello")
public class User {
    private int id;
    private String name;
    private String password;   //密码和数据库不一样

}
