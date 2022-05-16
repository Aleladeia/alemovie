package com.Aledev.Alemovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aledev.Alemovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
