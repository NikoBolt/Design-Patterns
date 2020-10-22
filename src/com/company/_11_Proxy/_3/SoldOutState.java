package com.company._11_Proxy._3;

public class SoldOutState implements State {

	//
	private static final long serialVersionUID = 2L;
	//
	/* */ transient /* */ GumballMachine gumballMachine; // Значит это поле не сериализуется
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	// Некорректное действие
	// Автомат отклоняет монету, т.к. все шарики проданы
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	// Некорректное действие
	// Если шариков небыло, то автомат не принимал монеты, значит и вернуть не может
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	// Некорректное действие
	//  Выдача невозможна, в автомате нет шариков
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	// Некорректное действие
	// Нельзя выдать то чего нет
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	// НО только сдесь его можно зарядить
	public void refill() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "sold out";
	}
}
