/**
 * @ClassName StaticProxy
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/8 22:31
 * @Version 1.0
 **/

// 静态代理模式总结：
// 真实对象和代理对象都要实现同一个接口
// 代理对象要代理真是角色

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 好处：
 * 代理对象可以做很多真实对象做不了的事情
 * 真实对象专注做自己的事情
*/
public class StaticProxy {
    public static void main(String[] args) {
        final You you = new You();  // 你要结婚

        new Thread(()-> System.out.println("我爱你")).start();         // Thread 相当于WeddingCompany 是一个代理  代理runnable接口 ，调用start方法
        new WeddingCompany(new You()).HappyMarry();
//        final WeddingCompany weddingCompany = new WeddingCompany(you);
//        weddingCompany.HappyMarry();
    }

}

interface Marry{

    void HappyMarry();
}

// 真实角色，你去结婚
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("超哥要找个美女结婚了，超级开心");
    }
}

// 代理角色，帮助你结婚
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();

    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }
    private void after() {
        System.out.println("结婚之后，收尾款");
    }
}
