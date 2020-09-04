package com.company._1_Strategy._3_Interfaces;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("I'm fly");
    }

    @Override
    public void quack() {
        System.out.println("Qwak");
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
