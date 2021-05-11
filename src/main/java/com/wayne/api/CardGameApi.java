package com.wayne.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wayne.dao.CardGameDAO;
import com.wayne.model.CardGame;
import com.wayne.service.ServiceManager;

@RestController
@RequestMapping("CardGame")
public class CardGameApi {

	@Autowired
	private ServiceManager generalServices;

	/**
	 * METHOD POST Calls to the method of service to make the request and creates a
	 * new Merchandising
	 * 
	 * @param cardGame
	 */
	@PostMapping("/save")
	public void saveCardGame(@RequestBody CardGame cardGame) {
		this.generalServices.saveCardGame(cardGame);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get a
	 * CardGame by ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public java.util.Optional<CardGame> getCardGameByID(@PathVariable("id") Integer id) {
		return this.generalServices.getCardGameByID(id);
	}

	/**
	 * METHOD PUT Calls to the method of service to make the request and updates a
	 * CardGame by ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/seasson/{seasson}")
	public java.util.List<CardGame> getCardGameBySeasson(@PathVariable("seasson") Integer seasson) {
		return this.generalServices.getCardGameBySeassonCardGames(seasson);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get all
	 * CardGame
	 * 
	 * @return
	 */
	@GetMapping("")
	public java.util.List<CardGame> getAllCardGame() {
		return this.generalServices.getAllCardGame();
	}

}
