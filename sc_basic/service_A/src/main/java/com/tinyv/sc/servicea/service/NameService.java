package com.tinyv.sc.servicea.service;

/**
 * Created by mayue on 2020/6/17.
 */

public interface NameService {

    String getServiceName(String param);

    /**
     * 该方法中，线程会先沉睡5秒钟， 然后返回一个String
     * @param param
     * @return
     */
    String getServiceNameBlocked(String param);

}
