# Gumball Machine with Proxy Pattern

To get code running on localhost: 
            всесто localhost можно писать адрес компа типа "seattle.mightygumball.com"

1. Change directories to the same level with headfirst/ folder in bin/
    открываешь в консоли директорию
    
2. Run rmiregistry in background:
    Запускаешь в консоли службу RMI
    rmiregistry &

3. Run: 
        Запуск службы GumballMachine
    java headfirst/designpatterns/proxy/gumball/GumballMachineTestDrive localhost 300

    ****    у меня так
    java com.company._11_Proxy._3/GumballMachineTestDrive localhost 300
            300 - количество шариков

4. In a different window, run:
        Запускает заказчик или в другом окне
    java headfirst/designpatterns/proxy/gumball/GumballMonitorTestDrive localhost

    ****    у меня так
    java com.company._11_Proxy._3/GumballMonitorTestDrive localhost



