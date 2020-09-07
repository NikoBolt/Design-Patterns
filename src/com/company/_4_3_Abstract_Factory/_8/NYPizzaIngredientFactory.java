package com.company._4_3_Abstract_Factory._8;

import com.company._4_3_Abstract_Factory._8.Ingredients.*;
import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.Cheese;
import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.ReggianoCheese;
import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.Dough;
import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.ThinCrustDough;
import com.company._4_3_Abstract_Factory._8.Ingredients.Sauce.MarinaraSauce;
import com.company._4_3_Abstract_Factory._8.Ingredients.Sauce.Sauce;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
