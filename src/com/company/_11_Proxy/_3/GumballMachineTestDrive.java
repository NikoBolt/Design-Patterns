package com.company._11_Proxy._3;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		try {	// Конструктор может инициировать исключение
			count = Integer.parseInt(args[1]);

			gumballMachine =
					new GumballMachine(args[0], count);

			// Публикуем заглушку GumballMachine под именем gumballMachine
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
			//Naming.rebind("//localhost/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
