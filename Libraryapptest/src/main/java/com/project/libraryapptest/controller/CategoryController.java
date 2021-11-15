package com.project.libraryapptest.controller;


import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.model.Category;
import com.project.libraryapptest.service.category.CategoryService;
import com.project.libraryapptest.utils.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() throws BadRequestException {

        return categoryService.getAllCategories();
    }

    @PostMapping("/categories")
    public ResponseEntity<ApiResponse> addCategories(@RequestBody Category categoryDetails) throws BadRequestException {

        categoryService.addCategory(categoryDetails);
        ApiResponse response = new ApiResponse(HttpStatus.OK.value(),true, "Category Created Successfully", categoryDetails);
        return new ResponseEntity<>(response, HttpStatus.OK);


    }
}
