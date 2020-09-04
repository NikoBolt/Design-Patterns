package com.company._1_Strategy._3_Interfaces;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("I'm a Rubber duck");
    }
}
