package net.javaguides.springboot.service.impl;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.dto.ProductDto;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import net.javaguides.springboot.util.ResponseStructure;

public class ProductServiceImpl implements ProductService{

	@Override
	public ResponseEntity<ResponseStructure<Product>> saveProduct(ProductDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ResponseStructure<Product>> findProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
