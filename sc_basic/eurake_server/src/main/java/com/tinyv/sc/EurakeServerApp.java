package com.tinyv.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by mayue on 2020/6/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeServerApp {

    public static void main(String[] args){
        SpringApplication.run(EurakeServerApp.class, args);
    }

}
