package com.example.payment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.payment.model.Book;
import com.example.payment.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	@Cacheable(cacheNames = "books")
	public List<Book> getBook(){
		System.out.println("not from cache");
		List<Book> books = new ArrayList<Book>();
		bookRepo.findAll().forEach(b->books.add(b));
		return books;
	}
	
	public Book addBook(Book b) {
		return bookRepo.save(b);
	}
}
