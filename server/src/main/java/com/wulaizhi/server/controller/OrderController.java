package com.wulaizhi.server.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wulaizhi.server.Feign.OrderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
   @Resource
   private OrderFeign orderFeign;

    @GetMapping("/get")
    public String get() {
        return orderFeign.getOrderOne();
    }
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/getByTem")
    public String getByTem() {
        return restTemplate.getForObject("http://provider/order/get"
                , String.class);
    }

}
