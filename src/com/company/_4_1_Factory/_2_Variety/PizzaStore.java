package com.company._4_1_Factory._2_Variety;

public class PizzaStore {
 
	public Pizza orderPizza(String type) {
		Pizza pizza;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		}
		else /*if (type.equals("pepperoni"))*/ {
		pizza = new PepperoniPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
