package com.wayne.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wayne.model.BoardGame;

/**
 * This interface makes the function to establish interactions with the database
 * 
 * @author johnwayne
 *
 */
public interface BoardGameDAO extends JpaRepository<BoardGame, Integer> {

	/**
	 * This function updates with 3 parameters that 2 of them they will be updated
	 * and we need the ID to find the data that we want to update.
	 * 
	 * @param type        String
	 * @param description String
	 * @param id          int
	 */
	@Transactional
	@Modifying
	@Query(value = "update board_game set type=:type, description=:description where id=:id", nativeQuery = true)
	public void updateBoardGameById(@Param("type") String type, @Param("description") String description,
			@Param("id") int id);
}
