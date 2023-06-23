package com.xinmen.dao;

import com.xinmen.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    //    @Select("select * from tb_book where id = #{id}")
//    public Book getById(Integer id);
    @Insert("insert into tb_book(name,type,description) values(#{name},#{type},#{description})")
    public void save(Book book);

    @Update("update tb_book set name=#{name},type=#{type},description=#{description} where id=#{id}")
    public void update(Book book);

    @Delete("delete from tb_book where id=#{id}")
    public void delete(Integer id);

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tb_book")
    public List<Book> getAll();


    public void deleteByIds(@Param("ids") Integer[] ids);
}
