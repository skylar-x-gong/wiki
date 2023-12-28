package com.skylar.wiki.controller;

import com.skylar.wiki.req.EbookReq;
import com.skylar.wiki.resp.CommonResp;
import com.skylar.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req) {
        CommonResp<List <EbookResp>> resp = new CommonResp();
        List <EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
