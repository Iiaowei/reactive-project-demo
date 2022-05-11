package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author liaowei
 * @version V1.0
 * @date 2022/5/11 12:23:00
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public Mono<String> sayHello() {
        return Mono.just("Hello World!");
    }
}
