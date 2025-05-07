package com.myself.mapper;

import com.myself.pojo.Order;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 13:33
 */
public interface OrderMapper {
    //根据id查询订单号以及对应的客户
    Order queryOrderById(Integer id);
}
