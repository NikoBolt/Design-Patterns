package com.company._4_3_Abstract_Factory._8.PizzaStore;

import com.company._4_3_Abstract_Factory._8.Pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;

//		pizza = factory.createPizza(type);
		pizza = createPizza(type); // вызывается фабричный метод

		//
		System.out.println("--- Making a " + pizza.getName() + " ---");
		//

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	/*protected*/ abstract Pizza createPizza(String type);
	// другие методы
}