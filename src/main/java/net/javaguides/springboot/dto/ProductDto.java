package net.javaguides.springboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
	private long id;
	private String productName;
	private String producttype;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	
}
