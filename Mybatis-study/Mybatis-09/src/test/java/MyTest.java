import com.mao.dao.UserMapper;
import com.mao.pojo.User;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class MyTest {
    @Test
    public void testQueryUserById(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        System.out.println("================================");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);

        session.close();
    }

    @Test
    public void testQueryUserById2(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

//        HashMap map = new HashMap();
//        map.put("name","毛哥哥");
//        map.put("id",3);
//        mapper.updateUser(map);

//        session.clearCache();   //手动清理缓存

        System.out.println("======================");

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        session.close();
    }

    @Test
    public void testQueryUserById3(){
        SqlSession session = MybatisUtils.getSession();
        SqlSession session2 = MybatisUtils.getSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper2 = session2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        session.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);

        session2.close();
    }
}
