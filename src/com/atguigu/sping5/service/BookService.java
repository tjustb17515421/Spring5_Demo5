package com.atguigu.sping5.service;

import com.atguigu.sping5.dao.BookDao;
import com.atguigu.sping5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入 dao,注入的dao中注入了 JdbcTemplate
    @Autowired
    private BookDao bookDao;


    //添加方法，将传入的Book调用接口实现类BookDaoImpl中的add方法进行数据库添加（存入）操作
    public void addBook(Book book)
    {
        bookDao.add(book);
    }
    //修改的方法
    public void updateBook(Book book)
    {
        bookDao.update(book);
    }
    //删除的方法
    public void deleteBook(String id)
    {
        bookDao.delete(id);
    }
    //查询表记录数
    public int selectCountMethod()
    {
       return bookDao.selectCount();
    }
    //查询返回对象
    public Book selectObj(String id)
    {
        return bookDao.selectObjBook(id);
    }
    //查询返回集合
    public List<Book> selectCollBook()
    {
        return bookDao.selectColl();
    }
    //批量添加
    public void batchAddBook(List<Object[]> batchArgs)
    {
        bookDao.batchAdd(batchArgs);
    }
    //批量修改
    public void batchUpdateBook(List<Object[]> batchArgs)
    {
        bookDao.batchUpdate(batchArgs);
    }
    //批量删除
    public void batchDeleteBook(List<Object[]> batchArgs)
    {
        bookDao.batchDelete(batchArgs);
    }
}
