package com.wayne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardGame {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String editorial;
	@Column
	private String numberOfCards;
	@Column
	private int seasson;

	/**
	 * DEFAULT CONSTRUCTOR
	 */
	public CardGame() {

	}

	// GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(String numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	public int getSeasson() {
		return seasson;
	}

	public void setSeasson(int seasson) {
		this.seasson = seasson;
	}

	@Override
	public String toString() {
		return "CardGame [id=" + id + ", name=" + name + ", editorial=" + editorial + ", numberOfCards=" + numberOfCards
				+ ", seasson=" + seasson + "]";
	}

}
