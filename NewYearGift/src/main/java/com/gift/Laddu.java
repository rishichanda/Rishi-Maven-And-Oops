package com.gift;

public class Laddu extends Sweet{

	String ladduBrand,ladduType;
	public void setInfo() {
		this.ladduBrand="Unspecifed";
		this.ladduType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String ladduBrand,String ladduType,double netWeight,double calories,double price) {
		this.ladduBrand=ladduBrand;
		this.ladduType=ladduType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Sweet Type:"+getSweetType());
		System.out.println("Laddu Brand: "+ladduBrand);
		System.out.println("Laddu Type: "+ladduType);
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
