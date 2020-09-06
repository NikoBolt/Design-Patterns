package com.company._4_1_Factory._4_Simple_Factory;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {
		name = "Pepperoni Pizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
	}
}
