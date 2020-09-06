package com.company._4_2_Factory_Method._6;

public abstract class PizzaStore {
//	SimplePizzaFactory factory;

//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}

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