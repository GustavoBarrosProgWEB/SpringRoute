package com.springroute.route.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springroute.route.entities.Books;
import com.springroute.route.repositories.BookRepository;

@Service
public class BooksService {

    @Autowired
    BookRepository bookRepository;

    public List<Books> findAll() {

        List<Books> list = bookRepository.findAll();

        return list;
    }

}
