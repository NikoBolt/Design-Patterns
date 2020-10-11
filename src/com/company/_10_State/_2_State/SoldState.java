package com.company._10_State._2_State;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    // Некорректное действие
        // Следует подождать завершения операции, прежде чем бросать другую монету
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    // Некорректное действие
        // Шарик уже куплен, возврат невозможен
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    // Некорректное действие
        // Покупатель дергает рычаг 2й раз, но 2й шарик он неполучит
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    // Покупка оплачена
    public void dispense() {
        gumballMachine.releaseBall();                               // Выдать шарик
        if (gumballMachine.getCount() > 0) {                            // Есть еще шарики?
            gumballMachine.setState(gumballMachine.getNoQuarterState());    // -Да. Перейти в NoQuarterState
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());      // -Нет. Перейти в SoldOutState
        }
    }

    @Override
    public void refill() { }

    public String toString() {
        return "dispensing a gumball";
    }
}
