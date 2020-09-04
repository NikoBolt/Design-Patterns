package com.company._1_Strategy._5_Integration;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
