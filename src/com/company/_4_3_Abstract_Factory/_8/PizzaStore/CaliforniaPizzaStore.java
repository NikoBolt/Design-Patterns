package com.company._4_3_Abstract_Factory._8.PizzaStore;

import com.company._4_3_Abstract_Factory._8.CaliforniaPizzaIngredientFactory;
import com.company._4_3_Abstract_Factory._8.Pizza.*;
import com.company._4_3_Abstract_Factory._8.PizzaIngredientFactory;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style Clam Pizza");
//        } else if (type.equals("pepperoni")) {
        } else /*if (type.equals("pepperoni"))*/ {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        }
        return pizza;
    }
}