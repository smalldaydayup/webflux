package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangkun
 */
@Service
public class BookServiceImpl implements BookService {

    public BookServiceImpl() {}

    /**
     * 获取广告 title
     *
     * @return
     */
    @Override
    public String getAdTitle() {
        return "ni hao";
    }
}
