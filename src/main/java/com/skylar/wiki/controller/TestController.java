package com.skylar.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiangjun Gong
 * @date 2023/12/24
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
