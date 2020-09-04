package com.company._1_Strategy._1_Duck;

public abstract class Duck {
    public void quack() {
        System.out.println("Qwak");
    }

    public void swim() {
        System.out.println("I swim!");
    }

    abstract void display();
}
