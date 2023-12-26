package com.skylar.wiki.service;

import com.skylar.wiki.domain.Demo;
import com.skylar.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xiangjun Gong
 * @date 2023/12/25
 */
@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
