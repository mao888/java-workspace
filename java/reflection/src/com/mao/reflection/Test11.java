package com.bobo.util.reflection.src.com.mao.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

// 通过反射获取泛型
public class Test11 {
    public void test01(Map<String,User>map, List<User>list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // 根据反射获取方法
        final Method test01 = Test11.class.getMethod("test01", Map.class, List.class);  // 获取方法
        // 获取方法的参数
        final Type[] genericParameterTypes = test01.getGenericParameterTypes();         // 通过方法获取泛型的参数化类型

        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);       // #java.util.Map<java.lang.String, com.bobo.util.reflection.src.com.mao.reflection.User>
            //判断参数是否是参数化类型
            if (genericParameterType instanceof ParameterizedType){     //ParameterizedType 表示一种参数化类型，比如Collection<String>
                //强转后获取参数化类型
                final Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments(); // 强转成参数化类型
                for (Type actualTypeArgument : actualTypeArguments) {                      // getActualTypeArguments获取真实的参数
                    System.out.println(actualTypeArgument);
                }
            }
        }
        /**
         * class java.lang.String
         * class com.bobo.util.reflection.src.com.mao.reflection.User
         * #java.util.List<com.bobo.util.reflection.src.com.mao.reflection.User>
         * class com.bobo.util.reflection.src.com.mao.reflection.User
         * */
        System.out.println("=========================================================");
        Method test02 = Test11.class.getMethod("test02", null);
        final Type genericReturnType = test02.getGenericReturnType();        // 通过方法获取泛型返回值类型

        if (genericReturnType instanceof ParameterizedType){
            final Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
        /**
         * class java.lang.String
         * class com.bobo.util.reflection.src.com.mao.reflection.User
         * */


    }
}
