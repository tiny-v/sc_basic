package com.tinyv.sc.servicea.service.impl;

import com.tinyv.sc.servicea.service.NameService;
import org.springframework.stereotype.Service;

/**
 * Created by mayue on 2020/6/17.
 */
@Service
public class NameServiceImpl implements NameService {

    @Override
    public String getServiceName(String param) {
        return "Client_Service_A_"+param;
    }

}
