package com.tinyv.sc.client_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by mayue on 2020/6/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceAppA {

    public static void main(String[] args){
        SpringApplication.run(ServiceAppA.class, args);
    }

}
