import com.mao.dao.UserDaoMysqlImpl;
import com.mao.dao.UserDaoSqlServer;
import com.mao.service.UserService;
import com.mao.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();

//        UserDaoMysqlImpl userDaoMysql =new UserDaoMysqlImpl();

        //用户实际调用的是业务层，dao层他们不需要接触！
        UserServiceImpl userService =new UserServiceImpl();


//        userService.setUserDao(new UserDaoMysqlImpl());
        userService.setUserDao(new UserDaoSqlServer());
        //        userDaoMysql.getUser();

        /*
        * 程序由原来的主动创建对象通过一个set方式被动的接受对象
        * 使用了set注入后，程序不再具有主动权，而是变成了被动接受的对象=IOC原型
        *
        * */
        userService.getUser();

    }
}
