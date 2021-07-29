package com.wzw.test;

import com.wzw.entity.MyClass;
import com.wzw.entity.Order;
import com.wzw.repository.MyClassRepository;
import com.wzw.repository.OrderRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author wei
 * @Date 2021/7/29
 */
public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream = Test5.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MyClassRepository myClassRepository = sqlSession.getMapper(MyClassRepository.class);
        MyClass myClass = myClassRepository.findById(10);
        System.out.println(myClass.getName());
        //关闭sqlSession
        sqlSession.close();
        //一级缓存，mybatis默认开启，存储在sqlSession
        //开启新的sqlSession
        sqlSession = sqlSessionFactory.openSession();
        myClassRepository = sqlSession.getMapper(MyClassRepository.class);
        MyClass myClass2 = myClassRepository.findById(10);
        System.out.println(myClass2.getName());
        sqlSession.close();
    }
}
