package com.company._4_2_Factory_Method._5_NY_Chicago_California;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		NYPizzaFactory nyFactory = new NYPizzaFactory();
		PizzaStore nyStore = new PizzaStore(nyFactory) ;
		nyStore.order("Veggie");

		ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
		PizzaStore chicagoStore = new PizzaStore(chicagoFactory) ;
		chicagoStore.order("Veggie");
	}
}
