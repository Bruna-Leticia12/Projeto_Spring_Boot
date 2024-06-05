package com.example.springbootprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootprojeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
