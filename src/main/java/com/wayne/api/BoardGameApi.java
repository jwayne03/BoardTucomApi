package com.wayne.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;
import com.wayne.dao.DAO;
import com.wayne.model.BoardGame;

import antlr.collections.List;

@RestController
@RequestMapping("BoardGame")
public class BoardGameApi {

	@Autowired
	private DAO dao;
	
	@PostMapping("/save")
	public void saveBoardGame(@RequestBody BoardGame boardGame) {
		this.dao.save(boardGame);
	}
	
	@GetMapping("/{id}")
	public Optional<BoardGame> getBoardGameById(@PathVariable("id") Integer id) {
		return this.dao.findById(id);
	}
	
	@GetMapping("")
	public List<DAO> updateBoardGameById(@RequestParam @PathVariable("id") Integer id) {
		
		
	}
	
	@DeleteMapping("/delete/{id}")
}
