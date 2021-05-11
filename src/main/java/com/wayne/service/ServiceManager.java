package com.wayne.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.wayne.dao.BoardGameDAO;
import com.wayne.dao.CardGameDAO;
import com.wayne.dao.MerchandisingDAO;
import com.wayne.dao.RoleGameDAO;
import com.wayne.model.BoardGame;
import com.wayne.model.CardGame;
import com.wayne.model.Merchandising;
import com.wayne.model.RoleGame;

@Service
public class ServiceManager {

	@Autowired
	private RoleGameDAO roleGameDAO;
	@Autowired
	private BoardGameDAO boardGameDAO;
	@Autowired
	private CardGameDAO cardGameDAO;
	@Autowired
	private MerchandisingDAO merchandisingDAO;

	// BOARDGAME

	/**
	 * Method to save a new BoardGame to the database
	 * 
	 * @param boardGame
	 */
	public void saveAllBoardGame(BoardGame boardGame) {
		boardGameDAO.save(boardGame);
	}

	/**
	 * Get all Boardgame by ID, if there are no id, returns null
	 * 
	 * @param id
	 * @return
	 */
	public Optional<BoardGame> getBoardGameById(Integer id) {
		if (id == null) {
			return null;
		} else {
			return this.boardGameDAO.findById(id);
		}
	}

	/**
	 * Update a boardgame by id
	 * 
	 * @param id with @PathVariable to request to the user
	 */
	public void updateBoardGameById(Integer id, String type, String description) {
		this.boardGameDAO.updateBoardGameById(type, description, id);
	}

	/**
	 * Function to remove by id
	 * 
	 * @param id
	 */
	public void removeById(Integer id) {
		this.boardGameDAO.deleteById(id);
	}

	// CARDGAME

	/**
	 * Save cardgame to the database
	 * 
	 * @param cardGame
	 */
	public void saveCardGame(CardGame cardGame) {
		this.cardGameDAO.save(cardGame);
	}

	/**
	 * Get cardgame by id
	 * 
	 * @param id
	 * @return
	 */
	public Optional<CardGame> getCardGameByID(Integer id) {
		return this.cardGameDAO.findById(id);
	}

	/**
	 * Updates the cardgame by id
	 * 
	 * @param id
	 * @return
	 */
	public java.util.List<CardGame> getCardGameBySeassonCardGames(Integer seasson) {
		return this.cardGameDAO.findCardGameBySeasson(seasson);
	}

	/**
	 * Get all cardgame
	 * 
	 * @return
	 */
	public java.util.List<CardGame> getAllCardGame() {
		return this.cardGameDAO.findAll();
	}

	// MERCHANDISING

	/**
	 * Save merchandising to the database
	 * 
	 * @param merchandising
	 */
	public void saveMerchandising(Merchandising merchandising) {
		this.merchandisingDAO.save(merchandising);
	}

	/**
	 * Get merchandising by ID
	 * 
	 * @param id
	 * @return
	 */
	public java.util.Optional<Merchandising> getMerchandisingByID(Integer id) {
		return this.merchandisingDAO.findById(id);
	}

	/**
	 * Update merchandising by ID
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<Merchandising> getMerchandisingByType(String type) {
		return this.merchandisingDAO.findByType(type);
	}

	/**
	 * Get all merchandising
	 * 
	 * @return
	 */
	public java.util.List<Merchandising> getAllMerchandising() {
		return this.merchandisingDAO.findAll();
	}

	// ROLEGAME

	/**
	 * Save rolegame to the database
	 * 
	 * @param roleGame
	 */
	public void saveRoleGame(RoleGame roleGame) {
		this.roleGameDAO.save(roleGame);
	}

	/**
	 * Get rolegame by ID
	 * 
	 * @param id
	 * @return
	 */
	public java.util.Optional<RoleGame> getRoleGameByID(Integer id) {
		return this.roleGameDAO.findById(id);
	}

	/**
	 * Update rolegame by ID
	 * 
	 * @param id
	 * @return
	 */
	public void updateRoleGameById(Integer id, String editorial) {
		this.roleGameDAO.updateRoleGameById(id, editorial);

	}

	/**
	 * Get all rolegame
	 * 
	 * @return
	 */
	public java.util.List<RoleGame> getAllRoleGame() {
		return this.roleGameDAO.findAll();
	}
}
