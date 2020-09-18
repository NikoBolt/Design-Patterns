package com.company._6_Command._8_Ссылки_на_методы.Obj;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + ": Ceiling fan is on HIGH");
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + ": Ceiling fan is on MEDIUM");
    }
    public void low() {
        speed = LOW;
        System.out.println(location + ": Ceiling fan is on LOW");
    }
    public void off() {
        speed = OFF;
        System.out.println(location + ": Ceiling fan is OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
