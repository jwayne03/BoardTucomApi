package com.wayne.api;

import java.util.ArrayList;
import java.util.Optional;

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
import com.wayne.service.ServiceManager;

@RestController
@RequestMapping("Merchandising")
public class MerchandisingApi {

	@Autowired
	private ServiceManager generalServices;

	/**
	 * METHOD POST Calls to the method of service to make the request
	 * 
	 * @param merchandising
	 */
	@PostMapping("/save")
	public void saveMerchandising(@RequestBody Merchandising merchandising) {
		this.generalServices.saveMerchandising(merchandising);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get a
	 * Merchandising by ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public java.util.Optional<Merchandising> getMerchandisingByID(@PathVariable("id") Integer id) {
		return this.generalServices.getMerchandisingByID(id);
	}

	/**
	 * METHOD PUT (UPDATE BY ID) Calls to the method of service to make the request
	 * and updates a Merchandising by ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/type/{type}")
	public ArrayList<Merchandising> getMerchandisingByType(@PathVariable("type") String type) {
		return this.generalServices.getMerchandisingByType(type);
	}

	/**
	 * METHOD GET Calls to the method of service to make the request and get all
	 * merchandising
	 * 
	 * @return
	 */
	@GetMapping("")
	public java.util.List<Merchandising> getAllMerchandising() {
		return this.generalServices.getAllMerchandising();
	}

}
