package com.gift;

public class Driver {
public static void main(String args[]) {

	Candy candy=new Candy();
	candy.setInfo("Akshay", "Anu", "Caramel");
	candy.getInfo();
	
	System.out.println();
	
	Sweet sweet=new Sweet();
	sweet.setInfo("Akshay", "Rishi", "Laddu");
	sweet.getInfo();
	
	System.out.println();
	
//Gift -> Candy -> Chocolate
	Chocolate choco =new Chocolate();
	//choco.setInfo(giftedBy, giftedTo, candyType);
	choco.setInfo("Dairy Milk", "Chocolate Bar", 120, 576, 50);
	choco.setCandyType("Chocolate");
	choco.getInfo();
	
	System.out.println();
//Gift -> Candy -> Caramel
	Caramel caramel=new Caramel();
	//caramel.setInfo(giftedBy, giftedTo);
	caramel.setCandyType("Caramel");
	caramel.setInfo("Canva", "Soft Caramel", 505, 780, 25);
	caramel.getInfo();

	System.out.println();
//Gift -> sweet -> Halva
	Halva halva=new Halva();
	halva.setSweetType("Dessert");
	halva.setInfo("Raam", "Carrot halva", 1000, 1500, 750);
	halva.getInfo();
	
	System.out.println();
//Gift -> sweet ->Laddu
	Laddu laddu=new Laddu();
	laddu.setInfo("SweetMagic", "Besan Laddu", 150, 756, 10);
	laddu.setSweetType("Starter");
	laddu.getInfo();
	
	
}
}
