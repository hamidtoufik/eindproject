package com.example.eindProject2.services;

import com.example.eindProject2.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
