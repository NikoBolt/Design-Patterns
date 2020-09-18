package com.company._6_Command._8_Ссылки_на_методы.Obj;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + ": TV is ON");
    }
    public void off() {
        System.out.println(location + ": TV is OFF");
    }
    public void setInputChannel() {
        System.out.println(location + ": TV channel is set for DVD");
    }
    public void setVolume() {}
}
