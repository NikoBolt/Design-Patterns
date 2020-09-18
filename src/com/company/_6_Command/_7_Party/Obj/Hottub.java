package com.company._6_Command._7_Party.Obj;

public class Hottub {
//    String location;
//    int temperature = 25;
//    boolean isHeating = false;
    boolean on;
    int temperature;

//    public Hottub(String location) {
//        this.location = location;
//    }
    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

//    public void cirulate() {
//        System.out.println("Hottub is on Circulate");
//    }
    public void circulate() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

//    public void jetsOn() {
//        System.out.println(location + " is bubbling!");
//    }
    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

//    public void jetsOff() {
//        System.out.println(location + " is OFF");
//    }
    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

//    public void setTemperature(int temperature) {
//        if (this.temperature < temperature) {
//            isHeating = true;
//        } else isHeating = false;
//
//        this.temperature = temperature;
//
//        if (isHeating) System.out.println(location + " is heating to a steaming " + temperature + " degrees");
//            else System.out.println(location + " is cooling to " + temperature + " degrees");
//    }
    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
            System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
        }
        else {
            System.out.println("Hottub is cooling to " + temperature + " degrees");
        }
        this.temperature = temperature;
    }
}
