package net.javaguides.springboot.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@OpenAPIDefinition
public class ApplicationDoc {
	
	Contact contact() {
		return new Contact().name("akshay").url("aksh.in").email("aksj@gmail.com");
		
	}
	@Bean
	Info info() {
		return new Info().title("product").description("aa").version("1.0");
	}
	@Bean
	OpenAPI openAPI() {
		return new OpenAPI().info(info());
	}
	

}
