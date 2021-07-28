package com.wzw.test;

import com.wzw.entity.People;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author wei
 * @Date 2021/7/26
 */
public class Test {
    public static void main(String[] args) {
        //加载MyBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        //获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //调用MyBatis原生接口执行SQL语句
        String statement = "com.wzw.mapper.PeopleMapper.findById";
        People people = sqlSession.selectOne(statement, 1);
        System.out.println(people);
        sqlSession.close();

    }
}
