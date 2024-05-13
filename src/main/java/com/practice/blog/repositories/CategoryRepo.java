package com.practice.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
