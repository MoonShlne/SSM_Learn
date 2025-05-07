package com.myself.pojo;

import lombok.Data;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 13:31
 */
@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private Integer customerId;
    private  Customer customer;
}
