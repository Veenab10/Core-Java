package com.xworkz.inheritance.builtin_methods;

public class Belt {
	
	public int length;
	public String type;
	public String material;
	public int price;
	
	@Override
	public String toString() {
		
		return "Belt=Length:"+length+",Type:"+type+",Material:"+material+",Price:"+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Ruuning equals in Belt class");
		System.out.println("type ="+this);
		
		
		if(obj!=null && obj instanceof Belt)
		{
		  Belt res=(Belt)obj;
		 if(this.material.equals(res.material)&&this.length==res.length &&this.type.equals(res.type))
		  {
			 System.out.println("Comapring with material,length and type ="+res);
			  return true;
		  }
		  
		}
		return false;
	}
	
	
			
		
	}
		

