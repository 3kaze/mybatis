package com.wzw.repository;

import com.wzw.entity.Course;

/**
 * @author wei
 * @Date 2021/7/28
 */
public interface CourseRepository {
    Course findById(Integer id);
}
