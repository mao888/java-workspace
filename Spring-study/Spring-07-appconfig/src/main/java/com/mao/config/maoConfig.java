package com.mao.config;

import com.mao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //代表这是一个配置类
@ComponentScan("com.mao.pojo")
@Import(maoConfig2.class)
public class maoConfig {

    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    //这个方法的返回值,就相当于bean标签中的class属性
    @Bean
    public User getuser(){
        return new User();      //就是返回要注入到bean的对象
    }
}
