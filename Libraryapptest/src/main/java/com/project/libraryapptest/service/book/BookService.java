package com.project.libraryapptest.service.book;

import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface BookService {

    List<Book> getAllBooks() throws BadRequestException;

    Book getBook(long id) throws BadRequestException;

    Book addBook(Book bookDetails, long categoryId) throws BadRequestException;

    Book updateBook(Book bookDetails, long id) throws BadRequestException;

    void deleteBook(long id) throws BadRequestException;

    List<Book> getBooksByCategory(long id) throws BadRequestException;

    Book updateBookByCategory(long bookId, long categoryId) throws BadRequestException;

}
