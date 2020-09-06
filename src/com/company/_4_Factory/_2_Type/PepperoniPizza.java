package com.company._4_Factory._2_Type;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {

	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);

	}
}
