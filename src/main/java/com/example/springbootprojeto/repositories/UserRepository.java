package com.example.springbootprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootprojeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}



