package com.example.payment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//Defines the set of cascadable operations that are propagated to the associated 
	//entity. The value cascade=ALL is equivalent to cascade={PERSIST, MERGE, REMOVE, 
	//REFRESH, DETACH}.

	
	private OrderData order;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public OrderData getOrder() {
		return order;
	}

	public void setOrder(OrderData order) {
		this.order = order;
	}
}
