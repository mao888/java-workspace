import com.mao.dao.StudentMapper;
import com.mao.dao.TeacherMapper;
import com.mao.pojo.Student;
import com.mao.pojo.Teacher;
import com.mao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void testStudent(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void testStudent2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students2 = mapper.getStudents2();
        for (Student student : students2) {
            System.out.println(student);
        }
        session.close();
    }
}

