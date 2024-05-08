package com.xworkz.collections.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.collections.dto.DegreeDTO;

public class PersonDTORunner {
	public static void main(String[] args) {

		DegreeDTO degree = new DegreeDTO("Veena", "BCA", 88, 2023);
		DegreeDTO degree1 = new DegreeDTO("Pallavi", "BA", 89, 2023);
		DegreeDTO degree2 = new DegreeDTO("Ganga", "BCA", 90, 2022);

		Map<String, DegreeDTO> map = new HashMap<String, DegreeDTO>();
		map.put("Veena", degree);
		map.put("Keerti", degree);
		map.put("pallavi", degree1);
		map.put("Ganga", degree2);

		map.forEach((name, d) -> System.out.println(name + ":" + d));

	}

}
