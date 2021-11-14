package com.project.libraryapptest.controller;


import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.model.Category;
import com.project.libraryapptest.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> getAllCategories() throws BadRequestException {

        return categoryService.getAllCategories();
    }
}
