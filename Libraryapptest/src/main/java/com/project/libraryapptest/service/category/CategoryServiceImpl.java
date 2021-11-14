package com.project.libraryapptest.service.category;

import com.project.libraryapptest.exception.BadRequestException;
import com.project.libraryapptest.model.Book;
import com.project.libraryapptest.model.Category;
import com.project.libraryapptest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() throws BadRequestException {
        return categoryRepository.findAll();
    }
}
