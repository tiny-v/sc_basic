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

    @Override
    public String getServiceNameBlocked(String param) {
        try{
            Thread.sleep(5*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Client_Service_A_"+param;
    }

}
