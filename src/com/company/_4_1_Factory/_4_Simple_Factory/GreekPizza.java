package com.company._4_1_Factory._4_Simple_Factory;

public class GreekPizza extends Pizza {
    public GreekPizza(){
        name = "Greek Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
