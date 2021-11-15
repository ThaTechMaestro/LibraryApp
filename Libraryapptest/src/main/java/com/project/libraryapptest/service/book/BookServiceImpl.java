package com.project.libraryapptest.service.book;

import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.model.Category;
import com.project.libraryapptest.repository.BookRepository;
import com.project.libraryapptest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public List<Book> getAllBooks() throws BadRequestException {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(long id) throws BadRequestException {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book addBook(Book bookDetails) throws BadRequestException {

       return bookRepository.save(bookDetails);
    }

    @Override
    public Book updateBook(Book bookDetails, long id) throws BadRequestException {

        Book book = bookRepository.findById(id).get();
        book.setTitle(bookDetails.getTitle());
        book.setAuthors(bookDetails.getAuthors());
        book.setIsbn(bookDetails.getIsbn());
        book.setPublishingYear(bookDetails.getPublishingYear());
        book.setCategory(bookDetails.getCategory());

        return bookRepository.save(book);


    }

    @Override
    public void deleteBook(long id) throws BadRequestException {

        bookRepository.deleteById(id);

    }

    @Override
    public List<Book> getBooksByCategory(long id) throws BadRequestException{

        return bookRepository.findByCategoryId(id);


    }

    // Adding an existing book to a category
    @Override
    public Book updateBookByCategory(long bookId, long categoryId) throws BadRequestException {

        Optional <Book> bookValue = bookRepository.findById(bookId);
        if (bookValue.isPresent()){
            Optional <Category> categoryValue = categoryRepository.findById(categoryId);

            if (categoryValue.isPresent()){
                bookValue.get().setCategory(categoryValue.get());

            }

            return bookRepository.save(bookValue.get());
        }

        return null;
    }


}
