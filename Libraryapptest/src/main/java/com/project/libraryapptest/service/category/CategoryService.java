package com.project.libraryapptest.service.category;

import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryService {

    List<Category> getAllCategories() throws BadRequestException;

    Category addCategory(Category categoryDetails) throws BadRequestException;
}
