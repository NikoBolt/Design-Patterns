package com.company._11_Proxy._1_gumballmonitor;
 
public class GumballMonitor {
	GumballMachine machine;
 
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	// Отчет о местонахождении, количестве шариков и состоянии машины
	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current state: " + machine.getState());
	}
}
