package com.wzw.test;

import com.wzw.entity.Order;
import com.wzw.repository.OrderRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author wei
 * @Date 2021/7/29
 */
public class Test4 {
    public static void main(String[] args) {
        InputStream inputStream = Test4.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderRepository orderRepository = sqlSession.getMapper(OrderRepository.class);
        Order order = orderRepository.findById(16);
        System.out.println(order.getName());
        System.out.println(order.getCustomer().getName());
        sqlSession.close();
    }
}
