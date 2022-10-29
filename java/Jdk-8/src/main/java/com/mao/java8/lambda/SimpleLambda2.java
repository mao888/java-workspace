package main.java.com.mao.java8.lambda;

public class SimpleLambda2 {

    public static void main(String[] args) {

        System.out.println(run(((name, age) -> String.format("name:%s\n,age:%d\n",name,age))));

    }

    public static String run(format format){
        return format.run("胡超",20);
    }

    public interface format{
        String run(String name,int age);
    }

}
