package main.java.com.mao.java8.lambda;

//import org.junit.Test;

public class SimpleLambda {

    public static void main(String[] args) {
        //绾跨▼
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.printf("hello java8");
//            }
//        }).start();

//        new Thread(() -> {
//            System.out.printf("hello java8"); }).start();
//    }

        start(()-> System.out.printf("hello"));
    }


    public static void start(myrun2 myrun2) {
        new Thread(myrun2).start();
    }

    //1.鍙兘榛樿涓�涓柟娉� --銆嬪嚱鏁板紡鎺ュ彛
    //2.榛樿鏂规硶闄ゅ
    //3.Object 涓嬮潰鐨勬柟娉� --銆婳bject
    @FunctionalInterface
    public interface myrun2 extends Runnable {
        public default void run2(){

        };
        String toString();              //Object
        boolean equals(Object object);  //Object
    }

}