package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;
import com.wayne.model.CardGame;

public interface CardGameDAO extends JpaRepository<CardGame, Integer>{

}
