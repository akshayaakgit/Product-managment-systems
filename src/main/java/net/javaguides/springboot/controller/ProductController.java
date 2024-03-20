package net.javaguides.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import net.javaguides.springboot.dto.ProductDto;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import net.javaguides.springboot.service.ProductService;
import net.javaguides.springboot.util.ErrorStructure;
import net.javaguides.springboot.util.ResponseStructure;

@RestController
public class ProductController {
	
	ProductService productService;
	
	@PostMapping("/products")
	@Operation(description = "the application is saving the product into database",responses = {
			@ApiResponse(responseCode = "200",description = "Product Saved"),
			@ApiResponse(responseCode = "400",description = "Invalid inputs",content= {
			@Content(schema=@Schema(implementation = ErrorStructure.class))		
			})			
	})
	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody ProductDto dto){
		return productService.saveProduct(dto);		
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<ResponseStructure<Product>> findProduct(@PathVariable int productId){
		return productService.findProduct(productId);		
	}

}
