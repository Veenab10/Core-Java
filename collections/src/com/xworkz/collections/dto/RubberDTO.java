package com.xworkz.collections.dto;

import java.io.Serializable;

public class RubberDTO implements Serializable, Comparable<RubberDTO>{
	
	private String brand;
	private String color;
	private String shape;
	private String manufatureDate;
	
	public RubberDTO() {
		System.out.println("No-agrument constructor of RubberDTO");
	}

	public RubberDTO(String brand, String color, String shape, String manufatureDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.manufatureDate = manufatureDate;
	}
	
	@Override
	public int compareTo(RubberDTO ref) {
		System.out.println("running compare to...");
		return ref.getBrand().compareTo(this.brand);//desc
	}
	

	@Override
	public String toString() {
		return "RubberDTO [brand=" + brand + ", color=" + color + ", shape=" + shape + ", manufatureDate="
				+ manufatureDate + "]";
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(String manufatureDate) {
		this.manufatureDate = manufatureDate;
	}

}
