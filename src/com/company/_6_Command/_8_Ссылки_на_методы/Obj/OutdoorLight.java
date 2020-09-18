package com.company._6_Command._8_Ссылки_на_методы.Obj;

public class OutdoorLight {
    String location;

    public OutdoorLight(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Outdoor light is ON");
    }
    public void off() {
        System.out.println("Outdoor light is OFF");
    }
}
