package com.wayne.service;

import org.springframework.stereotype.Service;

import com.wayne.model.BoardGame;
import com.wayne.model.CardGame;
import com.wayne.model.Merchandising;
import com.wayne.model.RoleGame;

@Service
public class GeneralServices {
	
	private RoleGame roleGame;
	private BoardGame boardGame;
	private CardGame cardGame;
	private Merchandising merchandising;
	
	public GeneralServices() {
		
	}
}
