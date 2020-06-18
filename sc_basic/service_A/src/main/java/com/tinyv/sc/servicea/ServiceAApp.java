package com.tinyv.sc.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by mayue on 2020/6/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAApp {

    public static void main(String[] args){
        SpringApplication.run(ServiceAApp.class, args);
    }

}
