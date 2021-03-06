package com.wayne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Merchandising {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String type;
	@Column
	private String description;

	
	/**
	 * DEFAULT CONSTRUCTOR
	 */
	public Merchandising() {

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Merchandising [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description + "]";
	}

}
