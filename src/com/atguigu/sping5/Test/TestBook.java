package com.atguigu.sping5.Test;

import com.atguigu.sping5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void test1()

    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
/*  添加测试
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    修改测试
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("updat");
        book.setUstatus("b");
        bookService.updateBook(book);

    删除测试
        bookService.deleteBook("1");
    查询表记录数
        bookService.selectCountMethod();
    查询返回对象
        bookService.selectObj("1");
    查询返回对象
        bookService.selectCollBook();
    批量添加
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"3","ccc","c"};
        Object[] o2={"4","ddd","d"};
        Object[] o3={"5","eee","e"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAddBook(batchArgs);
    批量删除
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"cc","cc","3"};
        Object[] o2={"dd","dd","4"};
        Object[] o3={"ee","ee","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdateBook(batchArgs);
   */
        //批量删除
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"3"};
        Object[] o2={"4"};
        Object[] o3={"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDeleteBook(batchArgs);

    }
}
