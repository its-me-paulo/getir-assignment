package com.getir.bookstoreservice.repository;

import com.getir.bookstoreservice.documents.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findAllByIsbnIn(List<String> bookISBNs);
}
