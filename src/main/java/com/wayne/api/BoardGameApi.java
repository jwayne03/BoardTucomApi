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

import com.wayne.dao.BoardGameDAO;
import com.wayne.model.BoardGame;
import com.wayne.service.ServiceManager;

@RestController
@RequestMapping("BoardGame")
public class BoardGameApi {

	@Autowired
	private ServiceManager generalServices;

	/**
	 * METHOD POST Calls to the method of service to make the request and creates a
	 * new BoardGame
	 * 
	 * @param boardGame
	 */
	@PostMapping("/save")
	public void saveBoardGame(@RequestBody BoardGame boardGame) {
		this.generalServices.saveAllBoardGame(boardGame);
	}

	/**
	 * METHOD GET BY ID Calls to the method of service and gets the BoardGame by ID
	 * 
	 * @param id
	 * @return BoardGame
	 */
	@GetMapping("/{id}")
	public java.util.Optional<BoardGame> getBoardGameById(@PathVariable("id") Integer id) {
		return this.generalServices.getBoardGameById(id);
	}

	/**
	 * METHOD PUT (UPDATE BY ID) Calls to the method of service and update boardgame
	 * by ID
	 * 
	 * @param id
	 */
	@PutMapping("")
	public void updateBoardGameById(@RequestParam @PathVariable("id") Integer id, String type, String description) {
		this.generalServices.updateBoardGameById(id, type, description);
	}

	/**
	 * METHOD DELETE BY ID Calls to the method of service and removes an element by
	 * ID
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void removeById(@PathVariable("id") Integer id) {
		this.generalServices.removeById(id);
	}

}
