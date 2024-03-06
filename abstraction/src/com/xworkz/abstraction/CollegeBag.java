package com.xworkz.abstraction;

public class CollegeBag extends Bag {

	public CollegeBag(String brand, String material) {
		super(brand, material);
		
	}
	public CollegeBag(int price)
	{
		super(price);
	}
	@Override
	public void storage() {
		System.out.println("Storage running in college bag...");
		
	}

}
