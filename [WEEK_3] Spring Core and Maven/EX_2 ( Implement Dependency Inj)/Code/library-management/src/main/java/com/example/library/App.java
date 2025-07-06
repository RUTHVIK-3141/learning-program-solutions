package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.library.service.BookService;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService svc = ctx.getBean("bookService", BookService.class);
        svc.listAllBooks();
    }
}
