package com.tinyv.sc.client_a.service.impl;

import com.tinyv.sc.client_a.service.ClientServiceA;
import org.springframework.stereotype.Service;

/**
 * Created by mayue on 2020/6/17.
 */
@Service
public class ClientServiceAImpl implements ClientServiceA {

    @Override
    public String getServiceName(String param) {
        return "Client_Service_A_"+param;
    }

}
