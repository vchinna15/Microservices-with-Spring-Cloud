package com.example.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.payment.model.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long>{


}
