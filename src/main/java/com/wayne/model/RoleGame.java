package com.wayne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoleGame {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String editorial;
	@Column
	private String description;

	public RoleGame() {

	}

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

	@Override
	public String toString() {
		return "RoleGame [id=" + id + ", name=" + name + ", editorial=" + editorial + ", description=" + description
				+ "]";
	}

}
