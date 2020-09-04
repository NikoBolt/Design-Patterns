package com.company._1_Strategy._5_Integration_2;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
