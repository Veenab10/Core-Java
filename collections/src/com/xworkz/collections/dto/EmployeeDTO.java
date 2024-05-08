package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDTO implements Serializable, Comparable<EmployeeDTO> {
	private String name;
	private String designation;
	private Integer salary;
	
	public EmployeeDTO() {
		
		
	}

	public EmployeeDTO(String name, String designation, Integer salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public int compareTo(EmployeeDTO ref) {
	
		return this.getDesignation().compareTo(ref.getDesignation());
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
