package com.wayne.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;
import com.wayne.dao.BoardGameDAO;
import com.wayne.model.BoardGame;

import antlr.collections.List;

@RestController
@RequestMapping("BoardGame")
public class BoardGameApi {

	@Autowired
	private BoardGameDAO boardGameDAO;
	
	@PostMapping("/save")
	public void saveBoardGame(@RequestBody BoardGame boardGame) {
		this.boardGameDAO.save(boardGame);
	}
	
	@GetMapping("/{id}")
	public java.util.Optional<BoardGame> getBoardGameById(@PathVariable("id") Integer id) {
		return this.boardGameDAO.findById(id);
	}
	
	@PutMapping("")
	public java.util.List<BoardGame> updateBoardGameById(@RequestParam @PathVariable("id") Integer id) {
		return this.boardGameDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void removeById(@PathVariable("id") Integer id) {
		this.boardGameDAO.deleteById(id);
	}
}
