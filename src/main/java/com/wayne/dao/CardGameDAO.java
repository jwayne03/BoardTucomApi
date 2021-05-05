package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;
import com.wayne.model.CardGame;

/**
 * This interface makes the function to establish interractions with the
 * database
 * 
 * @author johnwayne
 */
public interface CardGameDAO extends JpaRepository<CardGame, Integer> {

}
