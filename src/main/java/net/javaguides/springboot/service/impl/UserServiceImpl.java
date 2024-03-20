package net.javaguides.springboot.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepo;
import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.util.ResponseStructure;

public class UserServiceImpl implements UserService {
	private UserRepo userRepo;
	private ResponseStructure<User> structure;

	@Override
	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		User uniqueUser = userRepo.save(user);

		return ResponseEntity.ok(structure.setStatus(HttpStatus.OK.value()).setMessage("").setData(uniqueUser));
	}

}
