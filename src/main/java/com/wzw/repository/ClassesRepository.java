package com.wzw.repository;

import com.wzw.entity.Classes;

/**
 * @author wei
 * @Date 2021/7/28
 */
public interface ClassesRepository {
    Classes findById(Integer id);
}
