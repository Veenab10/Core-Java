package com.xworkz.collections.dto;

import java.io.Serializable;

public class CollegeDTO implements Serializable, Comparable<CollegeDTO> {

	private String name;
	private Integer collegeID;
	private Integer noOfStaff;
	private Integer noOfStudents;

	public CollegeDTO() {

	}

	public CollegeDTO(String name, Integer collegeID, Integer noOfStaff, Integer noOfStudents) {
		super();
		this.name = name;
		this.collegeID = collegeID;
		this.noOfStaff = noOfStaff;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "CollegeDTO [name=" + name + ", collegeID=" + collegeID + ", noOfStaff=" + noOfStaff + ", noOfStudents="
				+ noOfStudents + "]";
	}

	@Override
	public int compareTo(CollegeDTO o) {
		System.out.println("running compareto..");
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if (obj != null) {
			if (obj instanceof CollegeDTO) {
				CollegeDTO collegeDTO = (CollegeDTO) obj;

				if (this.name.equals(name)) {
					return true;

				}
//				if(this.collegeID==obj)
//				{
//					return true;
//					
//				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	private CollegeDTO CollegeDTO(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(Integer collegeID) {
		this.collegeID = collegeID;
	}

	public Integer getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(Integer noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public Integer getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(Integer noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

}
