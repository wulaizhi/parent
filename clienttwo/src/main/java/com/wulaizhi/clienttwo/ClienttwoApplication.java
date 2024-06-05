package com.wulaizhi.clienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClienttwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienttwoApplication.class, args);
    }

}
