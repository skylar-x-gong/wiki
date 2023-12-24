package com.skylar.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Xiangjun Gong
 * {@code @date} 2023/12/24
 */
@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    //@PostMapping
    //@PutMapping
    //@DeleteMapping
    //@RequestMapping(value = "user/1", method = RequestMethod.GET)
    //@RequestMapping(value = "user/1", method = RequestMethod.DELETE)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }@PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }
}
