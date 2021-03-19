package com.springtest.rest.restapi.Exceptions;

public class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(long id){
		super("can't fin order with id " + id);
	}
}
