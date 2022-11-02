package com.example.demospringboot.services;

import com.example.demospringboot.domain.Book;

import java.util.List;

public interface BookServices {
    public Book addBook(Book Book);
    public List<Book> getAllBook();
}
