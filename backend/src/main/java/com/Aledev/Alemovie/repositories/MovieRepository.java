package com.Aledev.Alemovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aledev.Alemovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	
}
