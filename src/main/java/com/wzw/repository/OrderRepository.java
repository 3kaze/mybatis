package com.wzw.repository;

import com.wzw.entity.Order;

/**
 * @author wei
 * @Date 2021/7/29
 */
public interface OrderRepository {
    public Order findById(Integer id);
}
