package com.myself.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 13:30
 */
@Data
public class Customer {
    private  Integer customerId;
    private  String customerName;
    List<Order> orderList;
}
