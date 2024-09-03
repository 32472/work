package cn.jonhyu;

import cn.jonhyu.dao.BookDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyApp.class,args);
    }
}