import com.mao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //动态代理 代理的是接口：注意点
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.add();
    }
}
