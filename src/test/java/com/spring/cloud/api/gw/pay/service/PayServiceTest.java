package com.spring.cloud.api.gw.pay.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PayServiceTest {

    @Autowired
    PayService payService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getHello() {
        String hello = payService.getHello();
        System.out.println(hello);
    }

    @Test
    void getPay() {
        String kakao = payService.getPay("kakao", 1000);
        System.out.println(kakao);
    }
}