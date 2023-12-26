package com.skylar.wiki.controller;

import com.skylar.wiki.domain.Ebook;
import com.skylar.wiki.resp.CommonResp;
import com.skylar.wiki.service.EbookService;
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
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("list")
    public CommonResp list() {
        CommonResp<List <Ebook>> resp = new CommonResp();
        List <Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
