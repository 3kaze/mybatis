package com.wzw.test;

import com.wzw.entity.People;
import com.wzw.repository.PeopleRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author wei
 * @Date 2021/7/28
 */
public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现了自定义接口的代理对象
        PeopleRepository peopleRepository = sqlSession.getMapper(PeopleRepository.class);
//        People people = new People();
//        people.setName("小张");
//        people.setMoney(Double.valueOf(666));
//        int row = peopleRepository.save(people);
//        System.out.println(row);

//        People people = peopleRepository.findById(5);
//        System.out.println(people);
//
//        people.setName("小红");
//        people.setMoney(Double.valueOf(3333));
//        peopleRepository.update(people);

//        peopleRepository.deleteById(5);

        List<People> peopleList = peopleRepository.findAll();
        for (People people : peopleList) {
            System.out.println(people);
        }

        People people = peopleRepository.findByIdAndName(1, "ssss");
        System.out.println(people);

        sqlSession.commit();
        sqlSession.close();

    }
}
