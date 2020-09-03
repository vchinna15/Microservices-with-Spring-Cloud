package com.example.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.model.Book;
import com.example.payment.service.BookService;

@RestController
@RequestMapping(path = "/book")
public class BookController {
	
	
	@Autowired
	BookService service;
	
	@GetMapping("books")
	public List<Book> getBooks(){
		return service.getBook();
		
	}

	@GetMapping("addBook")
	public Book addBooks(){
		Book b= new Book();
		b.setName("complete java");
		return service.addBook(b);
	}
}
