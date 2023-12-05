package com.springroute.route.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springroute.route.services.BooksService;

@Controller
@RequestMapping(value = "/books") // localhost:8080/books
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping
    public ModelAndView index() {

        var listResult = booksService.findAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("bookResults", listResult);
        modelAndView.setViewName("books/result");
        return modelAndView;
    }

}
