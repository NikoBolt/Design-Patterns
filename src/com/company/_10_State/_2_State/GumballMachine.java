package com.company._10_State._2_State;

public class GumballMachine {
    // 4 состояния автомата
//    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
    State soldOutState;     // Пуст
    State noQuarterState;   // Заряжен
    State hasQuarterState;  // Опустили монету
    State soldState;        // Шарик продан

    State state;
    int count = 0;

//    public GumballMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
    public GumballMachine(int numberGumballs) {
        // Создает экземпляры State
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    // в автомат бросают монету
    public void insertQuarter() {
        // Действие делегируется объекту текущего состояния
        state.insertQuarter();
    }

    // покупатель пытается вернуть монету
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // покупатель дергает рычаг
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    // выдача шарика
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    // автомат заполняется жвачкой
    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }
    void setState(State state) {
        this.state = state;
    }


    // Get-теры
    int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
