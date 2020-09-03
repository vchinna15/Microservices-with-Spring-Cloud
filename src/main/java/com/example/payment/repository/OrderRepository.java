package com.example.payment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.payment.dto.OrderResponse;
import com.example.payment.model.OrderData;

public interface OrderRepository extends CrudRepository<OrderData, Long>{
	
	@Query("select new com.example.payment.dto.OrderResponse(a.id,b.id) from OrderData a, OrderItem b where a.id=b.order.id")
	public List<OrderResponse> getOrdeItemDetails();

}
