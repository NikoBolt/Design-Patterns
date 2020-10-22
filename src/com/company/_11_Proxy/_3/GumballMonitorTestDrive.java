package com.company._11_Proxy._3;

import java.rmi.*;
 
public class GumballMonitorTestDrive {
 
	public static void main(String[] args) {
			// Местонахождения всех автоматов, которые мы собираемся отслеживать
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
		                     "rmi://boulder.mightygumball.com/gumballmachine",
		                     "rmi://austin.mightygumball.com/gumballmachine"}; 
		
		if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }

			// Создаем массив мониторов
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
			// Получаем заместителя для каждого автомата
		for (int i=0;i < location.length; i++) {
			try {
           		GumballMachineRemote machine = 
						(GumballMachineRemote) Naming.lookup(location[i]); // Naming возвращает заместителя
           		monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}

			// Перебираем автоматы и выводим отчеты
		for (int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
