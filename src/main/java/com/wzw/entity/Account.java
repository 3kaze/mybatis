package com.wzw.entity;

import lombok.Data;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/28
 */
@Data
public class Account {
    private Integer id;
    private String name;
    private List<Course> courses;
}
