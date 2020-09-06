package com.company._4_1_Factory._4_Simple_Factory;

public class VeggiePizza extends Pizza {

	public VeggiePizza() {
        name = "Veggie Pizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
	}
}
