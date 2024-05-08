package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Objects;

public class CompanyDTO implements Serializable, Comparable<CompanyDTO> {

	private String name;
	private String gstNo;
	private String estDate;
	private String city;

	public CompanyDTO() {

	}

	public CompanyDTO(String name, String gstNo, String estDate, String city) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.estDate = estDate;
		this.city = city;
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", gstNo=" + gstNo + ", estDate=" + estDate + ", city=" + city + "]";
	}

	@Override
	public int compareTo(CompanyDTO ref) {

		return this.getGstNo().compareTo(ref.getGstNo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, estDate, gstNo, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		return Objects.equals(city, other.city) && Objects.equals(estDate, other.estDate)
				&& Objects.equals(gstNo, other.gstNo) && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getEstDate() {
		return estDate;
	}

	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
