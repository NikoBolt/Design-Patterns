package com.company._4_2_Factory_Method._6_Factory_Method;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Eghan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
