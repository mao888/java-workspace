package com.bobo.jdk.res;

import com.bobo.jdk.lambda.domain.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {


    /**
     * Stream结果收集
     *    收集到集合中
     */
    @Test
    public void test01(){
        // Stream<String> stream = Stream.of("aa", "bb", "cc");
        List<String> list = Stream.of("aa", "bb", "cc","aa")
                .collect(Collectors.toList());
        System.out.println(list);
        // 收集到 Set集合中
        Set<String> set = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toSet());
        System.out.println(set);
        // 如果需要获取的类型为具体的实现，比如：ArrayList HashSet

        ArrayList<String> arrayList = Stream.of("aa", "bb", "cc", "aa")
                //.collect(Collectors.toCollection(() -> new ArrayList<>()));
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);
        HashSet<String> hashSet = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);
    }

    /**
     * Stream结果收集到数组中
     */
    @Test
    public void test02(){
        Object[] objects = Stream.of("aa", "bb", "cc", "aa")
                .toArray(); // 返回的数组中的元素是 Object类型
        System.out.println(Arrays.toString(objects));
        // 如果我们需要指定返回的数组中的元素类型
        String[] strings = Stream.of("aa", "bb", "cc", "aa")
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

    }


    /**
     * Stream流中数据的聚合计算
     */
    @Test
    public void test03(){
        // 获取年龄的最大值
        Optional<Person> maxAge = Stream.of(
                new Person("张三", 18)
                , new Person("李四", 22)
                , new Person("张三", 13)
                , new Person("王五", 15)
                , new Person("张三", 19)
        ).collect(Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println("最大年龄：" + maxAge.get());
        // 获取年龄的最小值
        Optional<Person> minAge = Stream.of(
                new Person("张三", 18)
                , new Person("李四", 22)
                , new Person("张三", 13)
                , new Person("王五", 15)
                , new Person("张三", 19)
        ).collect(Collectors.minBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println("最新年龄:" + minAge.get());
        // 求所有人的年龄之和
        Integer sumAge = Stream.of(
                new Person("张三", 18)
                , new Person("李四", 22)
                , new Person("张三", 13)
                , new Person("王五", 15)
                , new Person("张三", 19)
        )
                //.collect(Collectors.summingInt(s -> s.getAge()))
                .collect(Collectors.summingInt(Person::getAge))
                ;
        System.out.println("年龄总和：" + sumAge);
        // 年龄的平均值
        Double avgAge = Stream.of(
                new Person("张三", 18)
                , new Person("李四", 22)
                , new Person("张三", 13)
                , new Person("王五", 15)
                , new Person("张三", 19)
        ).collect(Collectors.averagingInt(Person::getAge));
        System.out.println("年龄的平均值：" + avgAge);
        // 统计数量
        Long count = Stream.of(
                new Person("张三", 18)
                , new Person("李四", 22)
                , new Person("张三", 13)
                , new Person("王五", 15)
                , new Person("张三", 19)
        ).filter(p->p.getAge() > 18)
                .collect(Collectors.counting());
        System.out.println("满足条件的记录数:" + count);

    }

    /**
     * 分组计算
     */
    @Test
    public void test04(){
        // 根据账号对数据进行分组
        Map<String, List<Person>> map1 = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).collect(Collectors.groupingBy(Person::getName));
        map1.forEach((k,v)-> System.out.println("k=" + k +"\t"+ "v=" + v));
        System.out.println("-----------");
        // 根据年龄分组 如果大于等于18 成年否则未成年
        Map<String, List<Person>> map2 = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).collect(Collectors.groupingBy(p -> p.getAge() >= 18 ? "成年" : "未成年"));
        map2.forEach((k,v)-> System.out.println("k=" + k +"\t"+ "v=" + v));

    }
    /**
     * 分组计算--多级分组
     */
    @Test
    public void test05(){
        // 先根据name分组，然后根据age(成年和未成年)分组
        Map<String,Map<Object,List<Person>>> map =  Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).collect(Collectors.groupingBy(
                Person::getName
                ,Collectors.groupingBy(p->p.getAge()>=18?"成年":"未成年"
                )
        ));
        map.forEach((k,v)->{
            System.out.println(k);
            v.forEach((k1,v1)->{
                System.out.println("\t"+k1 + "=" + v1);
            });
        });
    }

    /**
     * 分区操作
     */
    @Test
    public void test06(){
        Map<Boolean, List<Person>> map = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).collect(Collectors.partitioningBy(p -> p.getAge() > 18));
        map.forEach((k,v)-> System.out.println(k+"\t" + v));
    }

    /**
     * 对流中的数据做拼接操作
     */
    @Test
    public void test07(){
        String s1 = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).map(Person::getName)
                .collect(Collectors.joining());
        // 张三李四张三李四张三
        System.out.println(s1);
        String s2 = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).map(Person::getName)
                .collect(Collectors.joining("_"));
        // 张三_李四_张三_李四_张三
        System.out.println(s2);

        String s3 = Stream.of(
                new Person("张三", 18, 175)
                , new Person("李四", 22, 177)
                , new Person("张三", 14, 165)
                , new Person("李四", 15, 166)
                , new Person("张三", 19, 182)
        ).map(Person::getName)
                .collect(Collectors.joining("_", "###", "$$$"));
        // ###张三_李四_张三_李四_张三$$$
        System.out.println(s3);
    }
}
