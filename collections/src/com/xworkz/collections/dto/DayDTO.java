package com.xworkz.collections.dto;

import java.io.Serializable;

public class DayDTO implements Serializable, Comparable<DayDTO> {
	private String name;
	private Integer order;
	
	public DayDTO() {
	System.out.println("no-agrument constructor of DayDTO ");
	}

	public DayDTO(String name, Integer order) {
		super();
		this.name = name;
		this.order = order;
	}
	
	@Override
	public int compareTo(DayDTO ref) {
		System.out.println("running compareto....");
		return this.getOrder().compareTo(ref.order);
	}

	@Override
	public String toString() {
		return "DayDTO [name=" + name + ", order=" + order + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}
