package com.example.financemanager.service;

import com.example.financemanager.model.Category;
import com.example.financemanager.model.User;
import com.example.financemanager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        category.setUser(user);
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return categoryRepository.findByUser(user);
    }
}
