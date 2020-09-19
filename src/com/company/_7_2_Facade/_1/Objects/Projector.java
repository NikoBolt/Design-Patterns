package com.company._7_2_Facade._1.Objects;

public class Projector {
    String name = "Top-O-Line Projector ";

    public void on() {
        System.out.println(name + "on");
    }

    public void wideScreenMode() {
        System.out.println(name + "in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println(name + "off");
    }
}
