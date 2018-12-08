package com.pdd.api.news.service.impl;

import com.pdd.api.news.dao.mapper.News_ContentMapper;
import com.pdd.api.news.service.News_ContentService;
import com.pdd.api.news.web.response.ResponseEntity;
import com.pdd.api.news.web.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:liyangpeng
 * @date:2018/12/7 14:47
 */
@Service
public class News_ContentServiceImpl implements News_ContentService{

    @Autowired
    private News_ContentMapper ncm;

    @Override
    public ResponseEntity queryList() {
        return ResponseResult.Success(ncm.queryList());
    }
}
