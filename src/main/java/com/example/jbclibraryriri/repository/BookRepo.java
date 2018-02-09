package com.example.jbclibraryriri.repository;


import com.example.jbclibraryriri.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
    Iterable<Book> findByisAvailableTrue();
    Iterable<Book> findByisAvailableFalse();
}
