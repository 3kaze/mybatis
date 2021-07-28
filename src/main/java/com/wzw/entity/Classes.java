package com.wzw.entity;

import lombok.Data;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/28
 */
@Data
public class Classes {
    private Integer id;
    private String name;
    private List<Student> students;
}
