package com.luqi.seata.order.service;


import com.luqi.seata.order.model.Order;

/**
 * @author jianjun.ren
 * @since 2021/02/16
 */
public interface OrderService {

    boolean create(Order order);
}
