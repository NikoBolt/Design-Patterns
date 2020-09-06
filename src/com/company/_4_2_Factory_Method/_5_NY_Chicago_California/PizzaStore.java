package com.company._4_2_Factory_Method._5_NY_Chicago_California;

public class PizzaStore {
	Factory factory;

	public PizzaStore(Factory factory) {
		this.factory = factory;
	}

	public void order(String type) {
		Pizza pizza;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
