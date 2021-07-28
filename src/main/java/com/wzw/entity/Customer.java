package com.wzw.entity;

import lombok.Data;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/29
 */
@Data
public class Customer {
    private Integer id;
    private String name;
    private List<Order> orders;
}
