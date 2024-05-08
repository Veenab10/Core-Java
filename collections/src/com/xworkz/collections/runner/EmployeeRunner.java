package com.xworkz.collections.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.xworkz.collections.dto.CompanyDTO;
import com.xworkz.collections.dto.EmployeeDTO;

public class EmployeeRunner {

	public static void main(String[] args) {

		CompanyDTO company1 = new CompanyDTO("Accenture", "29AAACH3235M1ZF", "3/4/23", "Banglore");

		CompanyDTO company2 = new CompanyDTO("Gallygar", "222G241ZG", "3/5/23", "Banglore");
		
		EmployeeDTO employee1=new EmployeeDTO("Veena","Java Develper",25000);
		
		EmployeeDTO employee2=new EmployeeDTO("Priya","Python Develper",35000);
		
		EmployeeDTO employee3=new EmployeeDTO("Rohan","Software Engineer",24000);
		EmployeeDTO employee4=new EmployeeDTO("Laxmi","Software Testing",20000);
		EmployeeDTO employee5=new EmployeeDTO("Varsha","Digital Markting",18000);
		
		//set the employee details
		
		Set<EmployeeDTO> employees1=new HashSet<>(Arrays.asList(employee1,employee2,employee3));
		Set<EmployeeDTO> employees2=new HashSet<>(Arrays.asList(employee4,employee5));
		
		Map<CompanyDTO, Set<EmployeeDTO>> map=new HashMap<CompanyDTO, Set<EmployeeDTO>>();
		map.put(company1, employees1);
		map.put(company2, employees2);
		
		map.forEach((company,emp)->System.out.println(company+"\n"+emp));

	}

}
