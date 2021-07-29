package com.wzw.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wei
 * @Date 2021/7/29
 */
@Data
//public class MyClass implements Serializable {
//ehcache二级缓存 实体类不需要实现序列化接口
public class MyClass {
    private Integer id;
    private String name;
}
