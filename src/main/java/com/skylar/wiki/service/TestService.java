package com.skylar.wiki.service;

import com.skylar.wiki.domain.Test;
import com.skylar.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xiangjun Gong
 * @date 2023/12/25
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
