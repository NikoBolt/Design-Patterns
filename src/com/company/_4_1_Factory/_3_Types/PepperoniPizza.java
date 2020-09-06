package com.company._4_1_Factory._3_Types;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {

	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
	}
}
