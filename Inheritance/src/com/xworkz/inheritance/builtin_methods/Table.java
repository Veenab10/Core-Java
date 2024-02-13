package com.xworkz.inheritance.builtin_methods;

public class Table {
	
	public Table()
	{
		System.out.println("No parameter constructor of Table");
	}
	
	public String baseMaterial="Alloy Steel";
	public String shape="L-shape";
	public String finishType="Bresh Type";
	
	@Override
	public String toString() {
		return "Table:"+"\n"+"Base Material:"+baseMaterial+"\n"+"Shape:"+"\n"+"Finish Type:"+finishType;
	}

}
