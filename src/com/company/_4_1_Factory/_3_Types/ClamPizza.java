package com.company._4_1_Factory._3_Types;

public class ClamPizza extends Pizza {

    public ClamPizza() {

    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
