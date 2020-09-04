package com.company._1_Strategy._2_Fly;

public abstract class Duck {
    public void quack() {
        System.out.println("Qwak");
    }

    public void swim() {
        System.out.println("I swim!");
    }

    abstract void display();

    void fly() {
        System.out.println("I'm fly");
    }
}
