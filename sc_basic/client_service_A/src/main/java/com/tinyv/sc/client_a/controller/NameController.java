package com.tinyv.sc.client_a.controller;

import com.tinyv.sc.client_a.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayue on 2020/6/17.
 */
@RestController(value = "/clientA")
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/getServiceName")
    public String getServiceName(){
        return nameService.getServiceName(System.currentTimeMillis()+"");
    }

}
