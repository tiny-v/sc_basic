package com.tinyv.sc.clent_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by mayue on 2020/6/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ClientAppB {

    public static void main(String[] args){
        SpringApplication.run(ClientAppB.class, args);
    }

}
