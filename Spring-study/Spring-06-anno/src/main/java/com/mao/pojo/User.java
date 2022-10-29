package com.mao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="name" class="com.mao.pojo.User"/>
//@Component  组件
@Component
@Scope("prototype")
public class User {

    // 相当于配置文件中 <property name="name" value="kuangshen"/>
    @Value("kuangshen")
    public   String name ;

    public void setName(String name) {
        this.name = name;
    }

}

