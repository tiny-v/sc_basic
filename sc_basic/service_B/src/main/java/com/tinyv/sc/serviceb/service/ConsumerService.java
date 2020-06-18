package com.tinyv.sc.serviceb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mayue on 2020/6/17.
 */
@Component
@FeignClient(value="sc-service-A", fallbackFactory = LocalHystrixFallback.class)
@RequestMapping(value="/clientA")
public interface ConsumerService {

    @GetMapping(value="/getServiceName")
    String getServiceName();

    @GetMapping(value="/getServiceNameBlocked")
    String getServiceNameBlocked();

}
