package com.xworkz.collections.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.collections.dto.CEODTO;
import com.xworkz.collections.dto.CompanyDTO;

public class CompanyRunner {

	public static void main(String[] args) {
		
		CompanyDTO company1=new CompanyDTO("Accenture", "29AAACH3235M1ZF", "3/4/23", "Banglore");
		
		CompanyDTO company2=new CompanyDTO("Gallygar", "222G241ZG", "3/5/23", "Banglore");
		
		CEODTO ceo1=new CEODTO("Veena", 10, "Bagalkot", 100000l);
		
		Map<CompanyDTO, CEODTO> map=new HashMap<CompanyDTO, CEODTO>();
		map.put(company1, ceo1);
		map.put(company2, ceo1);
		
		map.forEach((company,ceo)->System.out.println(company+"\n"+ceo));

	}

}
