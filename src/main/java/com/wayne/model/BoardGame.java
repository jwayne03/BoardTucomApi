package com.wayne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BoardGame {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String editorial;
	@Column
	private String description;
	@Column
	private String numberOfPlayers;
	@Column
	private String type;

	/**
	 * DEFAULT CONSTRUCTOR
	 */
	public BoardGame() {

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(String numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BoardGame [id=" + id + ", name=" + name + ", editorial=" + editorial + ", description=" + description
				+ ", numberOfPlayers=" + numberOfPlayers + ", type=" + type + "]";
	}

}
