package com.practice.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
