package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Objects;

public class DegreeDTO implements Serializable, Comparable<DegreeDTO> {

	private String name;
	private String stream;
	private Integer percentage;
	private Integer yop;

	public DegreeDTO() {
		System.out.println("No-agrument constructor of DegreeDTO");
	}

	public DegreeDTO(String name, String stream, Integer percentage, Integer yop) {
		super();
		this.name = name;
		this.stream = stream;
		this.percentage = percentage;
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "DegreeDTO [name=" + name + ", stream=" + stream + ", percentage=" + percentage + ", yop=" + yop + "]";
	}

	@Override
	public int compareTo(DegreeDTO ref) {
		System.out.println("running compareTo...");
		return this.getStream().compareTo(ref.getName());
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj != null) {
//			if (obj instanceof DegreeDTO) {
//				DegreeDTO casted = (DegreeDTO) obj;
//
//				if (casted.stream.equals(obj.yop)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}


	@Override
	public int hashCode() {
		return Objects.hash(name, percentage, stream, yop);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DegreeDTO other = (DegreeDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(percentage, other.percentage)
				&& Objects.equals(stream, other.stream) && Objects.equals(yop, other.yop);
	}

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Integer getYop() {
		return yop;
	}

	public void setYop(Integer yop) {
		this.yop = yop;
	}

}
