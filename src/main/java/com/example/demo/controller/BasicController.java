package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author zhangkun
 */
@RestController
public class BasicController {
    @GetMapping("/hello/world")
    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello world");
    }

    @GetMapping("/book/desc")
    public Mono<String> getBookInfo() {
        return Mono.just("Bell on war");
    }
}
