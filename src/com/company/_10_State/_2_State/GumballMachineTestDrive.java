package com.company._10_State._2_State;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine); // Шарики=2

        gumballMachine.insertQuarter();     //      Монеты=1
        gumballMachine.turnCrank();         // Шарики=1

        System.out.println(gumballMachine); // Шарики=1

        gumballMachine.insertQuarter();     //      Монеты=2
        gumballMachine.turnCrank();         // Шарики=0
        gumballMachine.insertQuarter();     // Шариков больше нет
        gumballMachine.turnCrank();         // Шариков нет, дергать бесполезно

        gumballMachine.refill(5);     // Шарики=5
        gumballMachine.insertQuarter();     //      Монеты=3
        gumballMachine.turnCrank();         // Шарики=4

        System.out.println(gumballMachine); // Шарики=4
    }
}
