package com.atguigu.sping5.dao;

import com.atguigu.sping5.entity.Book;

import java.util.List;

public interface BookDao {

    //添加的方法
    void add(Book book);
    //修改的方法
    void update(Book book);
    //删除的方法
    void delete(String id);
    //查询表记录数
    int  selectCount();
    //查询返回对象
    Book selectObjBook(String id);
    //查询返回集合
    List<Book> selectColl();
    //批量添加的方法
    void batchAdd(List<Object[]> batchArgs);
    //批量修改的方法
    void batchUpdate(List<Object[]> batchArgs);
    //批量删除的方法
    void batchDelete(List<Object[]> batchArgs);
}
