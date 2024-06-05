package com.example.springbootprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootprojeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
