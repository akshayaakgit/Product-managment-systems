package net.javaguides.springboot.service;

import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.dto.ProductDto;
import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.util.ResponseStructure;

public interface UserService {
	ResponseEntity<ResponseStructure<User>> saveUser(User user);

}
