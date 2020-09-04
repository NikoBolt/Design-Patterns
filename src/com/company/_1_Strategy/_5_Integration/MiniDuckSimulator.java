package com.company._1_Strategy._5_Integration;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
    }
}