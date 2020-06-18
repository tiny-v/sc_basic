package com.tinyv.sc.serviceb.controller;

import com.tinyv.sc.serviceb.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayue on 2020/6/17.
 */
@RestController(value="/clientB")
public class ServiceBController {

    @Autowired
    private ConsumerService serviceAClient;

    @RequestMapping(value="/getServiceName", method= RequestMethod.GET)
    public String getServiceName(){
        return serviceAClient.getServiceName();
    }

    @RequestMapping(value="/getServiceNameBlocked", method= RequestMethod.GET)
    public String getServiceNameBlocked(){
        return serviceAClient.getServiceNameBlocked();
    }

}
