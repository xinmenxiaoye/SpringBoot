package com.xinmen.service.impl;

import com.xinmen.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void saveBook() {
        System.out.println("save book");
    }
}
