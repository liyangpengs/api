package com.pdd.api.news.web.controller;

import com.pdd.api.news.service.News_ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pdd.api.news.web.response.ResponseEntity;

/**
 * @author:liyangpeng
 * @date:2018/12/7 14:57
 */
@RestController
public class News_ContentController {

    @Autowired
    private News_ContentService ncs;

    @GetMapping("/queryList")
    public ResponseEntity queryList(){
        return ncs.queryList();
    }
}
