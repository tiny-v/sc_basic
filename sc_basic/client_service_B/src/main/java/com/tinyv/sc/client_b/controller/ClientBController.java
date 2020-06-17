package com.tinyv.sc.client_b.controller;

import com.tinyv.sc.client_b.feign_service.ClientBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayue on 2020/6/17.
 */
@RestController(value="/clientB")
public class ClientBController {

    @Autowired
    private ClientBService clientBService;

    @RequestMapping(value="/getServiceName",method= RequestMethod.GET)
    public String getServiceName(){
        return clientBService.getServiceName();
    }

}
