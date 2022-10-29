package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
// 在企业中，我们的所有pojo都会序列化！
public class User implements Serializable {
    private String name;
    private int age;
}
