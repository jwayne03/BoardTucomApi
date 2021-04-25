package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;
import com.wayne.model.RoleGame;

public interface RoleGameDAO extends JpaRepository<RoleGame, Integer> {

}
