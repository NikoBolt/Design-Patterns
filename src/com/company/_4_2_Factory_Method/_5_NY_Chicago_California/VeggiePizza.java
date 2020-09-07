package com.company._4_2_Factory_Method._5_NY_Chicago_California;

public class VeggiePizza extends Pizza {

	public VeggiePizza() {
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}

//	@Override
//	public void prepare() {
//		System.out.println("Preparing " + name);
//	}
}
