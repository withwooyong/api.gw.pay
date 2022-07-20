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
@RequestMapping(path = "/pay")
@RequiredArgsConstructor
public class PayController {

    private final PayService payService;

    @GetMapping(path = "/")
    ResponseEntity<String> getHello() {
        return ResponseEntity.ok("pay hello");
    }

    /**
     * http://localhost:8092/pay/type?type=kakao
     */
    @RequestMapping(path = "/type")
    ResponseEntity<String> getType(@RequestParam String type) {
        String result = payService.getType(type);
        return ResponseEntity.ok(result);
    }
}
