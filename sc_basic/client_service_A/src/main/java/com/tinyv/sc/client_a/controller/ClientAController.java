package com.tinyv.sc.client_a.controller;

import com.tinyv.sc.client_a.service.ClientServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayue on 2020/6/17.
 */
@RestController(value = "/clientA")
public class ClientAController {

    @Autowired
    private ClientServiceA clientServiceA;

    @GetMapping("/getServiceName")
    public String getServiceName(){
        return clientServiceA.getServiceName(System.currentTimeMillis()+"");
    }

}
