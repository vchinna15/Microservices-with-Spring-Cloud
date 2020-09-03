package com.example.payment.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	
	@Transactional(readOnly = true)
	public void getUsers() {
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
	// Create a new transaction, and suspend the current transaction if one exists. 
	//REQUIRED - tell Spring to either join an active transaction or to start a new one 
	//if the method gets called without a transaction. This is the default behavior
	//MANDATORY - Join active current transaction, throw exception if none exists.
	//NEVER- throw exception if the method gets called in an active current transaction
	//NOT_SUPORTED - 
	//Supports - join the active current transaction, execute non-transactionally if none exists.
	//ISOLATION Level:
	//READ_COMMITTED
	//READ_UNCOMMKITTED
	//REPEATABLE_READ
	
	//By default, it will rollback for all RunTimeException or Error and it's subclass
	public void saveUsers() {
		
	}
}
