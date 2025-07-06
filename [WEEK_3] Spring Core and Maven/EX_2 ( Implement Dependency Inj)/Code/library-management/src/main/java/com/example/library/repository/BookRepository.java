package com.example.library.repository;

import java.util.Arrays;
import java.util.List;
import com.example.library.model.Book;

public class BookRepository {
    public List<Book> findAll() {
        return Arrays.asList(
            new Book("1984"),
            new Book("Brave New World"),
            new Book("Fahrenheit 451")
        );
    }
}
