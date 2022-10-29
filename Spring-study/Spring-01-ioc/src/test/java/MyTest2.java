import com.mao.service.UserServiceImpl;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    public static void main(String[] args) {

        //获取ApplicationContext:拿到Spring的容器
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userService = (UserServiceImpl) Context.getBean("ServiceImpl");
        userService.getUser();
    }
}
