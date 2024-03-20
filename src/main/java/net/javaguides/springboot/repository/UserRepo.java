package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
