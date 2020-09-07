package com.company._4_1_Factory._3_Types;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
