package com.wayne.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wayne.model.BoardGame;
import com.wayne.model.CardGame;

/**
 * This interface makes the function to establish interactions with the database
 * 
 * @author johnwayne
 */
public interface CardGameDAO extends JpaRepository<CardGame, Integer> {
	/**
	 * Function that finds with a query the seassion
	 * 
	 * @param seasson
	 * @return
	 */
	//@Query(value = "select * from card_game where seasson=:seasson", nativeQuery = true)
	public ArrayList<CardGame> findCardGameBySeasson(int seasson);
}
