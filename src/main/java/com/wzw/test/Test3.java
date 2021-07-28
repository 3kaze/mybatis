package com.wzw.test;

import com.wzw.entity.Account;
import com.wzw.entity.Classes;
import com.wzw.entity.Course;
import com.wzw.entity.Student;
import com.wzw.repository.AccountRepository;
import com.wzw.repository.ClassesRepository;
import com.wzw.repository.CourseRepository;
import com.wzw.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author wei
 * @Date 2021/7/28
 */
public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test3.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //多对一
//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        Student student = studentRepository.findById(1);
//        System.out.println(student);

        //一对多
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        Classes classes = classesRepository.findById(2);
//        System.out.println(classes);

        //多对多
//        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        Account account = accountRepository.findById(1);
//        System.out.println(account);

        CourseRepository courseRepository = sqlSession.getMapper(CourseRepository.class);
        Course course = courseRepository.findById(1);
        System.out.println(course);
        sqlSession.close();
    }
}
