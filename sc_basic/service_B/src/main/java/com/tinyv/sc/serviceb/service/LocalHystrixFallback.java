package com.tinyv.sc.serviceb.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by mayue on 2020/6/18.
 */
@Component
public class LocalHystrixFallback implements FallbackFactory<ConsumerService> {

    @Override
    public ConsumerService create(Throwable throwable) {
        return new ConsumerService() {
            @Override
            public String getServiceName() {
                return "Request failed! this is the getServiceName fallback method !";
            }

            @Override
            public String getServiceNameBlocked() {
                return "Request failed! this is the getServiceNameBlocked fallback method !";
            }
        };
    }
}
