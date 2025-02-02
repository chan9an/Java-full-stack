package com.Lpu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="player")
public class PlayerModel {
	public PlayerModel(){}
	@Id
	public int id;
	@NotBlank(message="name cannot be blank")
	@Size(min = 3, max = 20,message="name must be between 2 to 20 char")
	private String name;
	public PlayerModel(int id, String name) {
		this.id = id;
		this.name = name;
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
}

