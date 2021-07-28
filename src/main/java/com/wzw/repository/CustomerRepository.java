package com.wzw.repository;

import com.wzw.entity.Customer;

/**
 * @author wei
 * @Date 2021/7/29
 */
public interface CustomerRepository {
    public Customer findById(Integer id);
}
