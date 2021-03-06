package com.company._7_1_Adapter._1_TurkeyAdapter;

import com.company._7_1_Adapter._1_TurkeyAdapter.Objects.Duck;
import com.company._7_1_Adapter._1_TurkeyAdapter.Objects.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
