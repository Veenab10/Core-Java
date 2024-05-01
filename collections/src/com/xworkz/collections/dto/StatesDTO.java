package com.xworkz.collections.dto;

import java.io.Serializable;

public class StatesDTO implements Serializable, Comparable<StatesDTO> {
	private String name;
	private Long population;
//	public enum Direction{
//		NORTH,SOUTH,EAST,WEST;
//	}
	private Direction direction;
	private String chieftMinsiterName;
	private Double revenue;
	private Long budget;

	public StatesDTO() {
		System.out.println("No-agrument constructor of StatesDTO");
	}

	public StatesDTO(String name, Long population, Direction direction, String chieftMinsiterName, Double revenue,
			Long budget) {
		super();
		this.name = name;
		this.population = population;
		this.direction = direction;
		this.chieftMinsiterName = chieftMinsiterName;
		this.revenue = revenue;
		this.budget = budget;
	}
	
	@Override
	public int compareTo(StatesDTO ref) {
		
		return this.getName().compareTo(ref.getName());
	}

	@Override
	public String toString() {
		return "StatesDTO [name=" + name + ", population=" + population + ", direction=" + direction
				+ ", chieftMinsiterName=" + chieftMinsiterName + ", revenue=" + revenue + ", budget=" + budget + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String getChieftMinsiterName() {
		return chieftMinsiterName;
	}

	public void setChieftMinsiterName(String chieftMinsiterName) {
		this.chieftMinsiterName = chieftMinsiterName;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

}
