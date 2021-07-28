package com.wzw.entity;

import lombok.Data;

/**
 * @author wei
 * @Date 2021/7/29
 */
@Data
public class Order {
    private Integer id;
    private String name;
    private Customer customer;
}
