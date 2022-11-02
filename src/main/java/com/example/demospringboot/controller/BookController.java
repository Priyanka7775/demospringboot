package com.example.demospringboot.controller;

import com.example.demospringboot.domain.Book;
import com.example.demospringboot.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookdata/v1/")
public class BookController {
    BookServices bookServices;

    @Autowired
    public BookController(BookServices bookServices){
        this.bookServices=bookServices;
    }

    @PostMapping(value = "/book")
    public ResponseEntity<?> insertBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookServices.addBook(book), HttpStatus.CREATED);
    }
}
