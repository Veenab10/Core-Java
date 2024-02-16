package com.xworkz.inheritance.equal_method;

public class Fan {
	
	public Fan() {
		System.out.println("no parameter constructor of Fan");
	}
	public String brand;
	public int price;
	public String controlMethod;
	public int noOfBlades;
	public int speed;
	public String switchType;
	
	@Override
	public String toString() {
		return "Fan=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Contro Method:"+controlMethod+"\t"+"No of Blades:"+noOfBlades+"\t"+"Speed:"+speed+"\t"+"Switch Type:"+switchType;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Fan");
		System.out.println(this);
		if(obj!=null && obj instanceof Fan)
		{
			Fan fan=(Fan)obj;
			System.out.println(fan);
			if(this.brand.equals(fan.brand) && this.noOfBlades==fan.noOfBlades && this.controlMethod.equals(fan.controlMethod))
			{
				return true;
			}
		}
		return false;
	}

}
