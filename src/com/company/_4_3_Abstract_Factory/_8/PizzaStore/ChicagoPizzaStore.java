package com.company._4_3_Abstract_Factory._8.PizzaStore;

import com.company._4_3_Abstract_Factory._8.ChicagoPizzaIngredientFactory;
import com.company._4_3_Abstract_Factory._8.Pizza.*;
import com.company._4_3_Abstract_Factory._8.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
//        } else if (type.equals("pepperoni")) {
        } else /*if (type.equals("pepperoni"))*/ {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
