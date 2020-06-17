package com.tinyv.sc.client_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by mayue on 2020/6/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ClientAppA {

    public static void main(String[] args){
        SpringApplication.run(ClientAppA.class, args);
    }

}
