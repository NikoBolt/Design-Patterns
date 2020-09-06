package com.company._4_Factory._3_Types;

public class VeggiePizza extends Pizza {

	public VeggiePizza() {

	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);

	}
}
