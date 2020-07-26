package com.gift;

public class Caramel extends Candy{

	String caramelBrand,caramelType;
	public void setInfo() {
		this.caramelBrand="Unspecifed";
		this.caramelType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String caramelBrand,String caramelType,double netWeight,double calories,double price) {
		this.caramelBrand=caramelBrand;
		this.caramelType=caramelType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Candy Type:"+getCandyType());
		System.out.println("Brand: "+caramelBrand);
		System.out.println("Caramel Type: "+caramelType);
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
