package com.company._6_Command._7_Party.Obj;

public class Light {
    String location;
//    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
//        level = 100;
        System.out.println(location + ": Light is ON");
    }

    public void off() {
//        level = 0;
        System.out.println(location + ": Light is OFF");
    }

//    public void dim(int level) {
//        this.level = level;
//        if (level == 0) {
//            off();
//        }
//        else {
//            System.out.println("Light is dimmed to " + level + "%");
//        }
//    }
//
//    public int getLevel() {
//        return level;
//    }
}
