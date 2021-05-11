package com.wayne.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wayne.model.BoardGame;
import com.wayne.model.Merchandising;

import antlr.collections.List;

/**
 * This interface makes the function to establish interactions with the database
 * 
 * @author johnwayne
 *
 */
public interface MerchandisingDAO extends JpaRepository<Merchandising, Integer> {
	/**
	 * function that find merchandising to check if there are the same type
	 * 
	 * @param id
	 * @return
	 */
	// @Query(value = "select * from merchandising where type=:type", nativeQuery =
	// true)
	public ArrayList<Merchandising> findByType(String type);
}
