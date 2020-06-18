package com.tinyv.sc.servicea.controller;

import com.tinyv.sc.servicea.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayue on 2020/6/17.
 */
@RestController
@RequestMapping(value = "/clientA")
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/getServiceName")
    public String getServiceName(){
        return nameService.getServiceName(System.currentTimeMillis()+"");
    }


    @GetMapping("/getServiceNameBlocked")
    public String getServiceNameBlocked(){
        return nameService.getServiceNameBlocked(System.currentTimeMillis()+"");
    }

}
