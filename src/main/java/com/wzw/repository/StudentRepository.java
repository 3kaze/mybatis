package com.wzw.repository;

import com.wzw.entity.People;
import com.wzw.entity.Student;

/**
 * @author wei
 * @Date 2021/7/28
 */
public interface StudentRepository {
    public Student findById(Integer id);
}
