package com.xworkz.inheritance.equal_method;

public class Carrom {
	public Carrom() {
		System.out.println("no parameter constructor of Carrom");
	}
	
	public String brand;
	public int price;
	public String genre;
	public String material;
	public int size;
	public String category;
	
	@Override
	public String toString() {
		return "Carrom=Brand:"+brand+"\t"+"Price:"+"\t"+"Genre:"+genre+"\t"+"Material:"+material+"\t"+"Size:"+size+"\t"+"Category:"+category;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Carrom class");
		System.out.println(this);
		if(obj!=null && obj instanceof Carrom)
		{
			Carrom ref=(Carrom)obj;
			System.out.println(ref);
			if(this.brand.equals(ref.brand) && this.price==ref.price && this.genre.equals(ref.genre))
			{
				return true;
			}
		}
		return false;
	}

}
