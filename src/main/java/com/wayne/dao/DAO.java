package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;

public interface DAO extends JpaRepository<BoardGame, Integer>{

}
