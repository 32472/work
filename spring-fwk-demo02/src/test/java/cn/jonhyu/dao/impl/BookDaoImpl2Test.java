package cn.jonhyu.dao.impl;

import cn.jonhyu.dao.BookDao;
import cn.jonhyu.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootApplication
class BookDaoImpl2Test {
     @Autowired
     private BookDao bookDao;
    @Test
    void findAll() {
        List<Book> books=bookDao.findAll();
         for(int i=0;i<books.size();i++){
             System.out.println(books.get(i));
         }
//             bookDao.findAll().stream()
//                     .forEach(System.out::println);
    }

    @Test
    void addBook() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void testAddBook() {
    }

    @Test
    void testFindAll1() {
    }

    @Test
    void testAddBook1() {
    }
}