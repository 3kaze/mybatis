package com.wzw.repository;

import com.wzw.entity.Account;

/**
 * @author wei
 * @Date 2021/7/28
 */
public interface AccountRepository {
    Account findById(Integer id);
}
