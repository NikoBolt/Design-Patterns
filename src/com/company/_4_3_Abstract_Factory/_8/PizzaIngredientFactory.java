package com.company._4_3_Abstract_Factory._8;

import com.company._4_3_Abstract_Factory._8.Ingredients.*;
import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.Cheese;
import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.Dough;
import com.company._4_3_Abstract_Factory._8.Ingredients.Sauce.Sauce;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
