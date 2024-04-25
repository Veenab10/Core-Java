package com.xworkz.collections.dto;

public class BoxDTO {
	private int area;
	private String color;
	private int serialNo;
	private String material;
	
	public BoxDTO() {
		System.out.println("No-agrument constructor of  BoxDTO");
	}

	public BoxDTO(int area, String color, int serialNo, String material) {
		super();
		this.area = area;
		this.color = color;
		this.serialNo = serialNo;
		this.material = material;
	}

	@Override
	public String toString() {
		return "BoxDTO [area=" + area + ", color=" + color + ", serialNo=" + serialNo + ", material=" + material + "]";
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
