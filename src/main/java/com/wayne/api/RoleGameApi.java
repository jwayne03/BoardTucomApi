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
import com.wayne.dao.RoleGameDAO;
import com.wayne.model.BoardGame;
import com.wayne.model.RoleGame;

import antlr.collections.List;

@RestController
@RequestMapping("RoleGame")
public class RoleGameApi {

	@Autowired
	private RoleGameDAO roleGameDAO;
	
	@PostMapping("/save")
	public void saveRoleGame(@RequestBody RoleGame roleGame) {
		this.roleGameDAO.save(roleGame);
	}
	
	@GetMapping("/{id}")
	public java.util.Optional<RoleGame> getRoleGameByID(@PathVariable("id") Integer id) {
		return this.roleGameDAO.findById(id);
	}
	
	@PutMapping("/{id}")
	public java.util.List<RoleGame> updateRoleGameById(@RequestParam @PathVariable("id") Integer id) {
		return this.roleGameDAO.findAll();
	}
	
	@GetMapping("")
	public java.util.List<RoleGame> getAllRoleGame() {
		return this.roleGameDAO.findAll();
	}
}

