package com.project.libraryapptest.repository;

import com.project.libraryapptest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    public List<Book> findByCategoryId(Long categoryId);


}
