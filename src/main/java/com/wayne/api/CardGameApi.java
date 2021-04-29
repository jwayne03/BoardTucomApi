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

@RestController
@RequestMapping("CardGame")
public class CardGameApi {

	@Autowired
	private CardGameDAO cardGameDAO;

	@PostMapping("/save")
	public void saveMerchandising(@RequestBody CardGame cardGame) {
		this.cardGameDAO.save(cardGame);
	}

	@GetMapping("/{id}")
	public java.util.Optional<CardGame> getCardGameByID(@PathVariable("id") Integer id) {
		return this.cardGameDAO.findById(id);
	}

	@PutMapping("")
	public java.util.List<CardGame> updateCardGameById(@RequestParam @PathVariable("id") Integer id) {
		return this.cardGameDAO.findAll();
	}

	@GetMapping("")
	public java.util.List<CardGame> getAllCardGame() {
		return this.cardGameDAO.findAll();
	}

}
