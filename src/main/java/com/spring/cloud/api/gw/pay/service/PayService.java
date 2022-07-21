package com.spring.cloud.api.gw.pay.service;

import org.springframework.stereotype.Service;

@Service
public class PayService {

    public String getHello() {
        return "pay hello";
    }

    public String getPay(String payType, int price) {
//        String s = RandomStringUtils.randomNumeric(10);
        return payType + " pay / " + price + " Won";
    }
}
