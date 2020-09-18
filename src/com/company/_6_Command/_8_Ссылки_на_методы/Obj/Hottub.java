package com.company._6_Command._8_Ссылки_на_методы.Obj;

public class Hottub {
    String location;
    int temperature = 25;
    boolean isHeating = false;

    public Hottub(String location) {
        this.location = location;
    }

    public void cirulate() {
        System.out.println("Hottub is on Circulate");
    }
    public void jetsOn() {
        System.out.println(location + " is bubbling!");
    }
    public void jetsOff() {
        System.out.println(location + " is OFF");
    }

    public void setTemperature(int temperature) {
        if (this.temperature < temperature) {
            isHeating = true;
        } else isHeating = false;

        this.temperature = temperature;

        if (isHeating) System.out.println(location + " is heating to a steaming " + temperature + " degrees");
            else System.out.println(location + " is cooling to " + temperature + " degrees");
    }

}
