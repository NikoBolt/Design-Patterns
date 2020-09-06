package com.company._4_1_Factory._4_Simple_Factory;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
