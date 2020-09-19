package com.company._7._1_TurkeyAdapter;

import com.company._7._1_TurkeyAdapter.Objects.*;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // Тестируем методы Turkey
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        // Тестируем методы Duck
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        // Вызываем вместо Duck через адаптор Turkey
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
