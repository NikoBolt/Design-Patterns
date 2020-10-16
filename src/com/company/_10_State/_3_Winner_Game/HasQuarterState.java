package com.company._10_State._3_Winner_Game;

import java.util.Random;

public class HasQuarterState implements State {
	// Генератор случайных чисел
	Random randomWinner = new Random(System.currentTimeMillis());

	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {			// Если повезло
			gumballMachine.setState(gumballMachine.getWinnerState());	// Переходим в состояние WinnerState
		} else {														// Иначе SoldState
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
