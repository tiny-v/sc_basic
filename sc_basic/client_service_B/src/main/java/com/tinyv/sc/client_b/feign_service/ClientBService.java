package com.tinyv.sc.client_b.feign_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mayue on 2020/6/17.
 */
@FeignClient(value="sc-client-A")
public interface ClientBService {

    @GetMapping(value="/clientA/getServiceName")
    String getServiceName();

}
