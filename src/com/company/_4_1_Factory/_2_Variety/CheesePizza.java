package com.company._4_1_Factory._2_Variety;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
	}
}
