package com.practice.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
