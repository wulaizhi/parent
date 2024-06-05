package com.wulaizhi.server.Feign;


import org.springframework.stereotype.Component;

@Component
public class OrderFeignClientFallback implements OrderFeign{
    @Override
    public String getOrderOne() {
        System.out.println("降级了");
        return "消费方降级了";
    }
}
