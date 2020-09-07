package com.company._4_3_Abstract_Factory._8;

import com.company._4_3_Abstract_Factory._8.Ingredients.*;
//import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.*;
//import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.*;
import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.Cheese;
import com.company._4_3_Abstract_Factory._8.Ingredients.Cheese.GoatCheese;
import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.Dough;
import com.company._4_3_Abstract_Factory._8.Ingredients.Dough.VeryThinCrust;
import com.company._4_3_Abstract_Factory._8.Ingredients.Sauce.BruschettaSauce;
import com.company._4_3_Abstract_Factory._8.Ingredients.Sauce.Sauce;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.BlackOlives;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.Eggplant;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.Spinach;
import com.company._4_3_Abstract_Factory._8.Ingredients.Veggies.Veggies;

public class CaliforniaPizzaIngredientFactory  implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new Calamari();
    }
}