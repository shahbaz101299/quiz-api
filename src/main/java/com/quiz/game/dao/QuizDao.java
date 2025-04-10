package com.quiz.game.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.game.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
