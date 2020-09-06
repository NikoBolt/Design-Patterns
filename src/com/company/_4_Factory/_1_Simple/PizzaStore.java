package com.company._4_Factory._1_Simple;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = new Pizza();

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
