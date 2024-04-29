package com.xworkz.collections.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {
	
	private String name;
	
	public StateDTO() {
		System.out.println("No-agrument constructor of StateDTO");
	}

	public StateDTO(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StateDTO [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
