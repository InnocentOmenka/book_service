package com.inno.bookseller.repositories;

import com.inno.bookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
