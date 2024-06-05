package com.wulaizhi.server.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",
        fallback = OrderFeignClientFallback.class)
public interface OrderFeign {
    @GetMapping("/order/get")
    String getOrderOne();
}
