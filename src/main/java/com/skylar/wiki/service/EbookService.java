package com.skylar.wiki.service;

import com.skylar.wiki.domain.Ebook;
import com.skylar.wiki.domain.EbookExample;
import com.skylar.wiki.mapper.EbookMapper;
import com.skylar.wiki.req.EbookReq;
import com.skylar.wiki.resp.EbookResp;
import com.skylar.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xiangjun Gong
 * @date 2023/12/25
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();  // 创建一个where条件
        criteria.andNameLike("%" + req.getName() + "%");
        System.out.println(req.getName());
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            // EbookResp ebookResp = new EbookResp();
//            // BeanUtils.copyProperties(ebook, ebookResp);
//            // 对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//
//            respList.add(ebookResp);
//        }

        // 列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);

        return list;
    }
}