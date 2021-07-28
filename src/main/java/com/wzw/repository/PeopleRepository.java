package com.wzw.repository;

import com.wzw.entity.People;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/28
 */
public interface PeopleRepository {

    public int save(People people);

    public int deleteById(Integer id);

    public int update(People people);

    public People findById(Integer id);

    public List<People> findAll();

    public People findByIdAndName(Integer id, String name);
}
