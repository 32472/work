package cn.jonhyu.controller;

import cn.jonhyu.dao.BookDao;
import cn.jonhyu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookDao bookDao;
    @GetMapping(value = "/books")
    public List<Book> findAllBook(){
        System.out.println("查询所有的书...");
       return bookDao.findAll();
    }

}
