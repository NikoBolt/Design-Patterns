package com.company._4_2_Factory_Method._5_NY_Chicago_California;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

//    @Override
//    public void prepare() {
//        System.out.println("Preparing " + name);
//    }
}
