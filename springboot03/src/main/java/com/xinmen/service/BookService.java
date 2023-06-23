package com.xinmen.service;

import com.xinmen.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookService {
    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();

    public boolean deleteByIds(Integer[] ids);


}
