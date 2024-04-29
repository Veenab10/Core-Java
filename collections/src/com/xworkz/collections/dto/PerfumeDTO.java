package com.xworkz.collections.dto;

import java.io.Serializable;

public class PerfumeDTO implements Serializable {
	
	private String brand;
	private String color;
	private int cost;
	private String fragrance;
	private int durationLast;
	
	public PerfumeDTO() {
		System.out.println("No-agrument constructor of PerfumeDTO");
	}

	public PerfumeDTO(String brand, String color, int cost, String fragrance, int durationLast) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.fragrance = fragrance;
		this.durationLast = durationLast;
	}

	@Override
	public String toString() {
		return "PerfumeDTO [brand=" + brand + ", color=" + color + ", cost=" + cost + ", fragrance=" + fragrance
				+ ", durationLast=" + durationLast + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public int getDurationLast() {
		return durationLast;
	}

	public void setDurationLast(int durationLast) {
		this.durationLast = durationLast;
	}
	

}
