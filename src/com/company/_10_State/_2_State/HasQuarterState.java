package com.company._10_State._2_State;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    // Некорректное действие
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
        // Вернуть монетку и перейти в NoQuarterState
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
        // Рычаг дернули -> переход в SoldState
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    // Некорректное действие
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() { }

    public String toString() {
        return "waiting for turn of crank";
    }
}
