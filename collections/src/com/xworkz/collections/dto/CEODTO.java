package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Objects;

public class CEODTO implements Serializable, Comparable<CEODTO> {

	private String name;
	private Integer experience;
	private String nativePlace;
	private Long salary;

	public CEODTO() {

	}

	public CEODTO(String name, Integer experience, String nativePlace, Long salary) {
		super();
		this.name = name;
		this.experience = experience;
		this.nativePlace = nativePlace;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CEODTO [name=" + name + ", experience=" + experience + ", nativePlace=" + nativePlace + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(CEODTO ref) {

		return this.getExperience().compareTo(ref.getExperience());

	}

	@Override
	public int hashCode() {
		return Objects.hash(experience, name, nativePlace, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEODTO other = (CEODTO) obj;
		return Objects.equals(experience, other.experience) && Objects.equals(name, other.name)
				&& Objects.equals(nativePlace, other.nativePlace) && Objects.equals(salary, other.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
