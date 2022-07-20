package com.spring.cloud.api.gw.pay.service;

import org.springframework.stereotype.Service;

@Service
public class PayService {

    public String getType(String pay) {
        return pay + "=1000";
    }
}
