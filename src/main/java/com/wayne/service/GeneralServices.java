package com.wayne.service;

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
public class GeneralServices {

	@Autowired
	private RoleGameDAO roleGameDAO;
	@Autowired
	private BoardGameDAO boardGameDAO;
	@Autowired
	private CardGameDAO cardGameDAO;
	@Autowired
	private MerchandisingDAO merchandisingDAO;

	// BOARDGAME

	public void saveAllBoardGame(BoardGame boardGame) {
		boardGameDAO.save(boardGame);
	}

	public Optional<BoardGame> getBoardGameById(Integer id) {
		if (id == null) {
			return null;
		} else {
			return this.boardGameDAO.findById(id);
		}
	}

	public void updateBoardGameById(@RequestParam @PathVariable("id") Integer id) {
		this.boardGameDAO.findById(id);
	}

	public void removeById(@PathVariable("id") Integer id) {
		this.boardGameDAO.deleteById(id);
	}

	// CARDGAME

	public void saveMerchandising(@RequestBody CardGame cardGame) {
		this.cardGameDAO.save(cardGame);
	}

	public java.util.Optional<CardGame> getCardGameByID(@PathVariable("id") Integer id) {
		return this.cardGameDAO.findById(id);
	}

	public java.util.List<CardGame> updateCardGameById(@RequestParam @PathVariable("id") Integer id) {
		return this.cardGameDAO.findAll();
	}

	public java.util.List<CardGame> getAllCardGame() {
		return this.cardGameDAO.findAll();
	}

	// MERCHANDISING

	public void saveMerchandising(@RequestBody Merchandising merchandising) {
		this.merchandisingDAO.save(merchandising);
	}

	public java.util.Optional<Merchandising> getMerchandisingByID(@PathVariable("id") Integer id) {
		return this.merchandisingDAO.findById(id);
	}

	public java.util.List<Merchandising> updateMerchandisingById(@RequestParam @PathVariable("id") Integer id) {
		return this.merchandisingDAO.findAll();
	}

	public java.util.List<Merchandising> getAllMerchandising() {
		return this.merchandisingDAO.findAll();
	}

	// ROLEGAME

	public void saveRoleGame(@RequestBody RoleGame roleGame) {
		this.roleGameDAO.save(roleGame);
	}

	public java.util.Optional<RoleGame> getRoleGameByID(@PathVariable("id") Integer id) {
		return this.roleGameDAO.findById(id);
	}

	public java.util.List<RoleGame> updateRoleGameById(@RequestParam @PathVariable("id") Integer id) {
		return this.roleGameDAO.findAll();
	}

	public java.util.List<RoleGame> getAllRoleGame() {
		return this.roleGameDAO.findAll();
	}
}
