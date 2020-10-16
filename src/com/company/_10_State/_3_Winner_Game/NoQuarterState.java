package com.company._10_State._3_Winner_Game;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	// Монетка брошена -> перейти в HasQuarterState
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	// Некорректное действие
	// Сначала надо бросить монету
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	// Некорректное действие
	// нет монетки - нет шарика
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	// Некорректное действие
	// Шарик выдается только за монету
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void refill() { }
 
	public String toString() {
		return "waiting for quarter";
	}
}
