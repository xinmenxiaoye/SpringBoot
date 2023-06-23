package com.xinmen;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xinmen.dao.BookDao;
import com.xinmen.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("西游记");
        book.setType("小说");
        book.setDescription("一个和尚和一个妖怪的故事");
        bookDao.insert(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(133);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(46L);
        book.setName("我们仨333");
        bookDao.updateById(book);
    }

    @Test
    void testSelect() {
        Book book = bookDao.selectById(46);
        System.out.println(book);
    }

    @Test
    void testGetByPage() {
        IPage page = new Page(1, 8);
        bookDao.selectPage(page, null);
        System.out.println("当前页码值：" + page.getCurrent());
        System.out.println("每页显示的条数：" + page.getSize());
        System.out.println("一共有多少页：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());
    }
}
