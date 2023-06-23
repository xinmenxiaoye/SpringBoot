package com.xinmen;

import com.xinmen.dao.BookDao;
import com.xinmen.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ApplicationTests {

    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("三国演义");
        book.setType("小说");
        book.setDescription("一个故事");
        bookDao.save(book);
    }


}
