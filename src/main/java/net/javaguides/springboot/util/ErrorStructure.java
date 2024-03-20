package net.javaguides.springboot.util;

import org.springframework.stereotype.Component;

import net.javaguides.springboot.entity.Product;
@Component
public class ErrorStructure <T>{
	private int statuscode;
	private String rootCause;
	private Product product;
	private String message;
	public String getMessage() {
		return message;
	}
	public ErrorStructure<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public ErrorStructure<T> setStatuscode(int statuscode) {
		this.statuscode = statuscode;
		return this;
	}
	public String getRootCause() {
		return rootCause;
	}
	public ErrorStructure<T> setRootCause(String rootCause) {
		this.rootCause = rootCause;
		return this;
	}
	public Product getProduct() {
		return product;
	}
	public ErrorStructure<T> setProduct(Product product) {
		this.product = product;
		return this;
	}
		
}
