package com.luqi.seata.order;

import com.luqi.seata.order.model.Order;
import com.luqi.seata.order.service.OrderService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@RestController
@SpringBootApplication
@MapperScan("com.luqi.seata.order.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class OrderServiceApplication {

    @Autowired
    private OrderService orderService;

    @GetMapping("order/create")
    public Boolean create(long userId , long productId){
        Order order = new Order();
        order.setCount(1)
            .setMoney(BigDecimal.valueOf(88))
            .setProductId(productId)
            .setUserId(userId)
            .setStatus(0);
        return orderService.create(order);
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
