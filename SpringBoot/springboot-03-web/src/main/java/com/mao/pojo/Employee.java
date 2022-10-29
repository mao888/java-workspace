package com.mao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
//员工表
public class Employee {
    private Integer id;
    private String ename;
    private String email;
    private Integer gender;     //0 女  1 男
    private int did;
    private String birthday;
    private String dname;
}
