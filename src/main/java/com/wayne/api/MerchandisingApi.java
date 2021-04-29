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

import com.wayne.dao.CardGameDAO;
import com.wayne.dao.MerchandisingDAO;
import com.wayne.model.CardGame;
import com.wayne.model.Merchandising;

@RestController
@RequestMapping("Merchandising")
public class MerchandisingApi {
	
	@Autowired
	private MerchandisingDAO merchandisingDAO;
	
	@PostMapping("/save")
	public void saveMerchandising(@RequestBody Merchandising merchandising) {
		this.merchandisingDAO.save(merchandising);
	}
	
	@GetMapping("/{id}")
	public java.util.Optional<Merchandising> getMerchandisingByID(@PathVariable("id") Integer id) {
		return this.merchandisingDAO.findById(id);
	}
	
	@PutMapping("")
	public java.util.List<Merchandising> updateMerchandisingById(@RequestParam @PathVariable("id") Integer id) {
		return this.merchandisingDAO.findAll();
	}
	
	@GetMapping("")
	public java.util.List<Merchandising> getAllMerchandising() {
		return this.merchandisingDAO.findAll();
	}

}
