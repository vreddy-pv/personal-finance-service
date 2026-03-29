package com.example.financemanager.repository;

import com.example.financemanager.model.Category;
import com.example.financemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByUser(User user);
}
