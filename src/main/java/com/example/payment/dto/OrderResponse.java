package com.example.payment.dto;

public class OrderResponse {
	
	private long orderId;
	private long orderItemId;
	
	public OrderResponse(long id, long oid) {
		this.orderId=id;
		this.orderItemId=oid;
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

}
