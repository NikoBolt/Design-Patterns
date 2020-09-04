package com.company._1_Strategy._2_Fly;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("I'm a Rubber duck");
    }

    @Override
    void fly() {}
}
