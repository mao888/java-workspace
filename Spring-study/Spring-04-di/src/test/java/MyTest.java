import com.mao.pojo.Address;
import com.mao.pojo.Student;
import com.mao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());

        Address addr = (Address) context.getBean("addr");
        System.out.println(addr.getAdress());

        System.out.println(student.toString());

    }

    @Test
    public void test2(){
        ApplicationContext user = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = (User) user.getBean("user");
        User user2 = (User) user.getBean("user");
        System.out.println(user1==user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1);
        System.out.println(user2);
    }


}
