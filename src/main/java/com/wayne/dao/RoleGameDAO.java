package com.wayne.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wayne.model.RoleGame;

/**
 * This interface makes the function to establish interractions with the
 * database
 * 
 * @author johnwayne
 *
 */

public interface RoleGameDAO extends JpaRepository<RoleGame, Integer> {

	/**
	 * function that find rolegame by id and updates the editorial
	 * 
	 * @param id
	 */
	@Transactional
	@Modifying
	@Query(value = "update role_game set editorial=:editorial where id=:id", nativeQuery = true)
	public void updateRoleGameById(Integer id, String editorial);
}
