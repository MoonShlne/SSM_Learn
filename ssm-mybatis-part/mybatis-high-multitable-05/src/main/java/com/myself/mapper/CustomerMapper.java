package com.myself.mapper;

import com.myself.pojo.Customer;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 15:42
 */
public interface CustomerMapper {
    //查询所有客户 以及对应的订单信息
    List<Customer> queryList();

}
