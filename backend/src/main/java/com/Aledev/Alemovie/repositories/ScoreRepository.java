package com.Aledev.Alemovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aledev.Alemovie.entities.Score;
import com.Aledev.Alemovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}
