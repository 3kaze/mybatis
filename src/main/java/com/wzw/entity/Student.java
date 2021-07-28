package com.wzw.entity;

import lombok.Data;

/**
 * @author wei
 * @Date 2021/7/28
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Classes classes;
}
