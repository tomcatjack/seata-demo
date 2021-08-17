package com.luqi.seata.order.mapper;

import com.luqi.seata.order.model.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jianjun.ren
 * @since 2021/02/16
 */
@Repository
public interface OrderMapper extends Mapper<Order> {

}
