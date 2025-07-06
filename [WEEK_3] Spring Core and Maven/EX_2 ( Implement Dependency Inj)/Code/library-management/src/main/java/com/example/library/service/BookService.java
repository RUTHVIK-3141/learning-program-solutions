package com.example.library.service;

import com.example.library.repository.BookRepository;
import com.example.library.model.Book;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService() { }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listAllBooks() {
        List<Book> books = bookRepository.findAll();
        for (Book b : books) {
            System.out.println("• " + b.getTitle());
        }
    }
}
