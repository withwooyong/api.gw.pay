package com.spring.cloud.api.gw.pay.controller;

import com.spring.cloud.api.gw.pay.service.PayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class PayController {

    private final PayService payService;

    @GetMapping
    ResponseEntity<String> getHello() {
        String hello = payService.getHello();
        return ResponseEntity.ok(hello);
    }

    /**
     * http://localhost:8092/pay?payType=kakao&price=1000
     */
    @RequestMapping(path = "/pay")
    ResponseEntity<String> getPay(@RequestParam String payType, @RequestParam int price) {
        String result = payService.getPay(payType, price);
        return ResponseEntity.ok(result);
    }
}
