package com.bobo.jdk.lambda;

import com.bobo.jdk.lambda.domain.Person;
import com.bobo.jdk.lambda.service.UserService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo04Lambda {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        /*list.add(new Person("周杰伦",33,175));
        list.add(new Person("刘德华",43,185));
        list.add(new Person("周星驰",38,177));
        list.add(new Person("郭富城",23,170));*/

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Person person : list) {
            System.out.println(person);
        }*/
        System.out.println("------");
        Collections.sort(list,(Person o1,Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person : list) {
            System.out.println(person);
        }
    }


}
