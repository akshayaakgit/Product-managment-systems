package net.javaguides.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.util.ErrorStructure;
import net.javaguides.springboot.util.ResponseStructure;
@RestController
public class UserController {
	private UserService userService;
	@Operation(description = "user data is saved in database",responses = {
			@ApiResponse(responseCode = "200",description = "user Saved"),
			@ApiResponse(responseCode = "400",description = "Invalid inputs",content= {
					@Content(schema=@Schema(implementation = ErrorStructure.class))
			})
	})
	@PostMapping("/users")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody @Valid User user){
		return userService.saveUser(user);
		
	}
}
