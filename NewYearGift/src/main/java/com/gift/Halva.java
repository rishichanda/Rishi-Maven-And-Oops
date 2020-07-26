package com.gift;

public class Halva extends Sweet{

	String halvaBrand,halvaType;
	public void setInfo() {
		this.halvaBrand="Unspecifed";
		this.halvaType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String halvaBrand,String halvaType,double netWeight,double calories,double price) {
		this.halvaBrand=halvaBrand;
		this.halvaType=halvaType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		//super.getInfo();
		System.out.println("Sweet Type:"+getSweetType());
		System.out.println("Halva Brand: "+halvaBrand);
		System.out.println("Halva Type: "+halvaType);
		System.out.println("Net Weight: "+netWeight);
		System.out.println("Calories: "+calories);
		System.out.println("Price: "+price);
	}
	
	public double getPrice() {
		return price;
	}
	public double getNetWeight() {
		return netWeight;
	}
	public double getCalories() {
		return calories;
	}

}
