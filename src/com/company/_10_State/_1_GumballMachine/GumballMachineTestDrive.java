package com.company._10_State._1_GumballMachine;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine); // Шарики=5

        gumballMachine.insertQuarter();     //      Монеты=1
        gumballMachine.turnCrank();         // Шарики=4

        System.out.println(gumballMachine); // Шарики=4

        gumballMachine.insertQuarter();     //      Монеты=2
        gumballMachine.ejectQuarter();      //      Монеты=1
        gumballMachine.turnCrank();         //   Сначала монету кинь

        System.out.println(gumballMachine); // Шарики=4

        gumballMachine.insertQuarter();     //      Монеты=2
        gumballMachine.turnCrank();         // Шарики=3
        gumballMachine.insertQuarter();     //      Монеты=3
        gumballMachine.turnCrank();         // Шарики=2
        gumballMachine.ejectQuarter();      //   Вы не бросили монету

        System.out.println(gumballMachine); // Шарики=2

        gumballMachine.insertQuarter();     //      Монеты=4
        gumballMachine.insertQuarter();     //   Нельзя бросить 2 монеты
        gumballMachine.turnCrank();         // Шарики=1
        gumballMachine.insertQuarter();     //      Монеты=5
        gumballMachine.turnCrank();         // Шарики=0
        gumballMachine.insertQuarter();     // Шариков больше нет
        gumballMachine.turnCrank();         // Шариков нет, дергать бесполезно

        System.out.println(gumballMachine);
    }
}
