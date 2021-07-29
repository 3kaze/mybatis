package com.wzw.repository;

import com.wzw.entity.MyClass;

/**
 * @author wei
 * @Date 2021/7/29
 */
public interface MyClassRepository {
    public MyClass findById(Integer id);
}
