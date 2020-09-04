package com.company._1_Strategy._5_Integration;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
