package com.wulaizhi.clientone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/get")
    public String getOrderOne() throws InterruptedException {
        int a= 3/0;
        return  "这是订单1"+"来自client1";
    }
}
