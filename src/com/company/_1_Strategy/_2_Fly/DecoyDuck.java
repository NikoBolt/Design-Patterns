package com.company._1_Strategy._2_Fly;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {}

    @Override
    void fly() {}

    @Override
    void display() {
        System.out.println("I'm a Decoy duck");
    }
}
