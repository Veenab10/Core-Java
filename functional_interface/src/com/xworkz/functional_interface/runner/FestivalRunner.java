package com.xworkz.functional_interface.runner;

public class FestivalRunner {

	public static void main(String[] args) {
		FestivalCheck check=new FestivalCheck((item,buy)->true);//lamda function (it is for functional Interface)
		check.check();
		System.out.println("After main");//implicit or exclipit

	}

}
