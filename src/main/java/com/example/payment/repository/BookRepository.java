package com.example.payment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.payment.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long>{

}
