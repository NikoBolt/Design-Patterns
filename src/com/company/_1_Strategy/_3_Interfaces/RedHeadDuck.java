package com.company._1_Strategy._3_Interfaces;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("I'm fly");
    }

    @Override
    public void quack() {
        System.out.println("Qwak");
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
