package com.project.libraryapptest.controller;

import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.repository.BookRepository;
import com.project.libraryapptest.service.book.BookService;
import com.project.libraryapptest.utils.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping("/books")
    public List<Book> getAllBooks() throws BadRequestException {

        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getSpecificBook(@PathVariable long id) throws BadRequestException {

        return bookService.getBook(id);
    }

    // Add a Book
    @PostMapping("/books")
    public ResponseEntity<ApiResponse> addNewBook(@RequestBody Book bookDetails) throws BadRequestException{

        bookService.addBook(bookDetails);
        ApiResponse response = new ApiResponse(HttpStatus.OK.value(),true, "Book Created Successfully", bookDetails);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    // Update Book Details
    @PutMapping("/books/{id}")
    public ResponseEntity<ApiResponse> updateBook(@RequestBody Book bookDetails, @PathVariable long id) throws BadRequestException{

        bookService.updateBook(bookDetails, id);
        ApiResponse response = new ApiResponse(HttpStatus.OK.value(),true, "Book Details Updated Successfully", bookDetails);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    // Delete a particular book
    @DeleteMapping("/books/{id}")
    public ResponseEntity<ApiResponse> deleteBook(@PathVariable long id) throws BadRequestException{

        bookService.deleteBook(id);
        ApiResponse response = new ApiResponse(HttpStatus.OK.value(),true, "Book Deleted Successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    // Get all the books in a category
    @GetMapping("/books/category/{id}")
    public List<Book> getBooksByCategory(@PathVariable long id) throws BadRequestException {

        return bookService.getBooksByCategory(id);
    }

    // Add Books to a category
    @PutMapping("/books/{bookId}/{categoryId}")
    public ResponseEntity<ApiResponse> updateBooksByCategory(@PathVariable long bookId, @PathVariable long categoryId) throws BadRequestException {

        bookService.updateBookByCategory(bookId, categoryId);

        ApiResponse response = new ApiResponse(HttpStatus.OK.value(),true, "Book category added Successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }














}
