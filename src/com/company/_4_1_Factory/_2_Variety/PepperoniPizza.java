package com.company._4_1_Factory._2_Variety;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);

	}
}
