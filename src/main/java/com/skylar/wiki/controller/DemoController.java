package com.skylar.wiki.controller;

import com.skylar.wiki.domain.Demo;
import com.skylar.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xiangjun Gong
 * {@code @date} 2023/12/25
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("list")
    public List<Demo> list() {
        return demoService.list();
    }
}
