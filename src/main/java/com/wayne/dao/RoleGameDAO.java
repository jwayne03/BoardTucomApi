package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;
import com.wayne.model.RoleGame;

/**
 * This interface makes the function to establish interractions with the
 * database
 * 
 * @author johnwayne
 *
 */
public interface RoleGameDAO extends JpaRepository<RoleGame, Integer> {

}
