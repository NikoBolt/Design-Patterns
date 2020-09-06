package com.company._4_Factory._3_Types;

public class PizzaStore {

 
	public Pizza orderPizza(String type) {
		Pizza pizza;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
//		} else if (type.equals("greek")) {
//			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
		pizza = new ClamPizza();
//		} else if (type.equals("veggie")) {
//		pizza = new VeggiePizza();
		}
		else /*if (type.equals("veggie"))*/ {
		pizza = new VeggiePizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
