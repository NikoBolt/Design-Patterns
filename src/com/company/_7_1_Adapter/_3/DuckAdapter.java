package com.company._7_1_Adapter._3;

import com.company._7_1_Adapter._3.Objects.Duck;
import com.company._7_1_Adapter._3.Objects.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
