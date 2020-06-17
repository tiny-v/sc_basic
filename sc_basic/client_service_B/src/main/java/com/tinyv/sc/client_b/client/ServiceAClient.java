package com.tinyv.sc.client_b.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mayue on 2020/6/17.
 */
@FeignClient(value="sc-client-A")
@RequestMapping(value="/clientA")
public interface ServiceAClient {

    @GetMapping(value="/getServiceName")
    String getServiceName();

}
