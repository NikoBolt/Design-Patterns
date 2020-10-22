package com.company._11_Proxy._3;

import java.rmi.RemoteException;

public class GumballMonitor {
		// Работаем с реализацмей интерфейса, а не с конкретным классом
	GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	// Отчет о местонахождении, количестве шариков и состоянии машины
	public void report() {
		try {  // трай кэч потому что в сети работаем
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " gumballs");
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}