package com.company._4_2_Factory_Method._5_NY_Chicago_California;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}

//	@Override
//	public void prepare() {
//		System.out.println("Preparing " + name);
//	}
}
