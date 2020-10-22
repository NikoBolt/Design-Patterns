package com.company._11_Proxy._3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine
		/* */ extends UnicastRemoteObject implements GumballMachineRemote /* */
			// Резим удаленной службы		и интерфейс удаленного доступа
{
	//
	private static final long serialVersionUID = 2L;
	//

	// -- Другие переменные
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;
	// --

	String location;

//	public GumballMachine(int numberGumballs) {
//    public GumballMachine(String location, int count) {
	public GumballMachine(String location, int numberGumballs)
				/* */ throws RemoteException /* */
					// Наследуется от суперкласса
	{
		// -- Код конструктора
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;
//		this.count = count;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
		// --

		this.location = location;
	}

	// в автомат бросают монету
	public void insertQuarter() {
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

	void setState(State state) {
		this.state = state;
	}

	// выдача шарика
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	// Перезарядка машины
	// автомат заполняется жвачкой
//	protected void refill(int count) {
//		this.count += count;
//		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
//		state.refill();
//	}
	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	// Геттер для местонахождения
	public String getLocation() {
		return location;
	}

	// Get-теры
	public int getCount() {
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

	public State getWinnerState() {
		return winnerState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2014");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}