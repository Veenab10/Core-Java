package com.xworkz.collections.dto;

import java.io.Serializable;

public class BrushDTO implements Serializable, Comparable<BrushDTO> {
	
	private String brand;
	private Integer price;
	private String material;
	private String type;
	
	public BrushDTO() {
		System.out.println("N0-agrument constrctor of BrushDTO");
	}

	public BrushDTO(String brand, Integer price, String material, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.type = type;
	}
	

	@Override
	public int compareTo(BrushDTO ref) {
		System.out.println("running compareto..");
//		if(ref.equals(this.price==50))
//		{
//			return 0;
//		}
//		else if(ref.equals(this.price>50))
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		//return ref.getPrice().compareTo(this.price);//descending order
		return this.getPrice().compareTo(ref.price);//Ascending Order
		
		 
	}

	@Override
	public String toString() {
		return "BrushDTO [brand=" + brand + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
