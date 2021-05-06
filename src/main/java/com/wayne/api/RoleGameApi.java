package com.wayne.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wayne.model.RoleGame;
import com.wayne.service.ServiceManager;

@RestController
@RequestMapping("RoleGame")
public class RoleGameApi {

	@Autowired
	private ServiceManager generalServices;

	/**
	 * METHOD POST Calls to the method of service to make the request and creates a
	 * new RoleGame
	 * 
	 * @param roleGame
	 */
	@PostMapping("/save")
	public void saveRoleGame(@RequestBody RoleGame roleGame) {
		this.generalServices.saveRoleGame(roleGame);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get a
	 * RoleGame by ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public java.util.Optional<RoleGame> getRoleGameByID(@PathVariable("id") Integer id) {
		return this.generalServices.getRoleGameByID(id);
	}

	/**
	 * METHOD PUT (UPDATE BY ID) Calls to the method of service to make the request
	 * 
	 * @param id
	 * @return
	 */
	@PutMapping("/{id}")
	public void updateRoleGameById(@RequestParam @PathVariable("id") Integer id) {
		this.generalServices.updateRoleGameById(id);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get all
	 * RoleGame data
	 * 
	 * @return
	 */
	@GetMapping("")
	public java.util.List<RoleGame> getAllRoleGame() {
		return this.generalServices.getAllRoleGame();
	}
}
