package com.company._4_Factory._2_Type;

public class CheesePizza extends Pizza {

	public CheesePizza() {}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
	}
}
