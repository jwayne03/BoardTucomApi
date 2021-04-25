package com.wayne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wayne.model.BoardGame;
import com.wayne.model.Merchandising;

public interface MerchandisingDAO extends JpaRepository<Merchandising, Integer>{

}
