import com.mao.config.maoConfig;
import com.mao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做,我们就只能通过 AnnotationConfig 上下文来获取容器,通过配置类的class对象加载!
        ApplicationContext Context = new AnnotationConfigApplicationContext(maoConfig.class);
        User getUser = (User) Context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
