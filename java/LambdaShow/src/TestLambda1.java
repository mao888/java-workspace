/**
 * @ClassName TestLambda1
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 11:59
 * @Version 1.0
 **/
public class TestLambda1 {
    // 3.静态内部类
    static class like3 implements ILike {
        @Override
        public void lambda() {
            System.out.println("3.静态内部类");
        }
    }

    public static void main(String[] args) {
        ILike like2 = new Like();
        like2.lambda();

        final like3 like3 = new like3();
        like3.lambda();

        // 4.局部内部类
        class like4 implements ILike {
            @Override
            public void lambda() {
                System.out.println("4.局部内部类");
            }
        }
        final like4 like4 = new like4();
        like4.lambda();

        // 5.匿名内部类，没有类的名称，必须借助接口或者父类
        like2= new ILike(){
            @Override
            public void lambda() {
                System.out.println("5.匿名内部类，没有类的名称，必须借助接口或者父类");
            }
        };
        like2.lambda();
        // 6.用lambda简化
        like2= ()->{
            System.out.println("6.用lambda简化");
        };
        like2.lambda();

    }
}

// 1.定义一个接口
interface ILike{
    void lambda();
}

// 2.实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("2.实现类");
    }
}
