package com.company._6_Command._7_Party.Obj;

public class TV {
    String location;
//    int channel;

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
