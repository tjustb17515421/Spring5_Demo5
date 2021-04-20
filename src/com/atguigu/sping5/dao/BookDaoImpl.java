package com.atguigu.sping5.dao;

import com.atguigu.sping5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //添加操作，下面是添加的方法，
    @Override
    public void add(Book book) {
        //创建SQL方法
        String sql="insert into t_book values(?,?,?)";
        //调用方法实现
        Object[] args={book.getUserId(), book.getUsername(), book.getUstatus()};
        int update= jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //修改操作
    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?,ustatus=? where userId=?";
        Object[] args = {book.getUsername(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
    //删除操作
    @Override
    public void delete(String id) {
        String sql = "delete from t_book where userId=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }
    //查询表记录数
    @Override
    public int selectCount() {
        String sql="select count(*) from t_book";
        Integer count=jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
        return count;
    }

    //查询返回对象
    @Override
    public Book selectObjBook(String id) {
        String sql="select * from t_book where userId=?";
        Book book=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        System.out.println(book);
        return book;

    }

    //查询返回集合
    @Override
    public List<Book> selectColl() {
        String sql="select * from t_book";
        List<Book> bookList =jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        System.out.println(bookList);
        return bookList;
    }

    //批量添加
    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";
        int [] ints=jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where userId=?";
        int [] ints=jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where userId=?";
        int [] ints=jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
