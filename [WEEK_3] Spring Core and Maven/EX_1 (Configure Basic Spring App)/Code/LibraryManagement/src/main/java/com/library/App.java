package com.library;
import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService svc = ctx.getBean("bookService", BookService.class);
    svc.addBook("1984");
    svc.addBook("Brave New World");
    System.out.println("Catalog:");
    svc.listBooks().forEach(System.out::println);
    ctx.close();
  }
}
