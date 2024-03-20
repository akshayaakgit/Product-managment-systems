package net.javaguides.springboot.service;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.dto.ProductDto;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.util.ResponseStructure;

public interface ProductService {

	ResponseEntity<ResponseStructure<Product>> saveProduct(ProductDto dto);

	ResponseEntity<ResponseStructure<Product>> findProduct(int productId);

}
