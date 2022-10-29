/**
 * @ClassName TestLambda2
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/9 12:50
 * @Version 1.0
 **/
public class TestLambda2 {
    // 静态内部类
    static class Love2 implements ILove{
        @Override
        public void love(int a) {
            System.out.println("i love 美女--》"+a);
        }
    }

    public static void main(String[] args) {
        final Love love1 = new Love();
        love1.love(1);

        final Love2 love2 = new Love2();
        love2.love(2);

        // 匿名内部类
        ILove iLove1 = new ILove(){
            @Override
            public void love(int a) {
                System.out.println("i love 美女--》"+a);
            }
        };
        iLove1.love(3);

        // 1.lambda表达式简化
        ILove iLove2 = (int a)-> {
            System.out.println("i love 美女--》"+a);
        };
        iLove2.love(4);

        // 简化1：参数类型
        ILove iLove3=(a)-> {
            System.out.println("i love 美女--》"+a);
        };
        iLove3.love(5);

        // 简化2：简化括号
        ILove iLove4 = a-> {
            System.out.println("i love 美女--》"+a);
            System.out.println("超哥爱美女"+a);
        };
        iLove4.love(6);

        // 简化3：去掉花括号
        ILove iLove5 = a-> System.out.println("i love 美女--》"+a);
        iLove5.love(7);

        /**
         * //总结:
         * lambda表达式只能有一行代码的情况下才能简化成为一行，如果有多行，那么就用代码块包裹。
         * 前提是接口为函数式接口
         * 多个参数也可以去掉参数类型，要去掉就都去掉,必须加上括号，
         **/
    }
}

interface ILove{
    void love(int a);
}

// 实现类
class Love implements ILove{
    @Override
    public void love(int a) {
        System.out.println("i love 美女--》"+a);
    }
}
