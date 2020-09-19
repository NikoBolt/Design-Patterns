package com.company._7_2_Facade._1.Objects;

public class Amplifier {
    String name = "Top-O-Line Amplifier ";

    public void on() {
        System.out.println(name + "on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(name + "setting DVD player to Top-O-Line DVD Player");
    }

    public void setSurroundSound() {
        System.out.println(name + "surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int i) {
        System.out.println(name + "setting volume to 5");
    }

    public void off() {
        System.out.println(name + "off");
    }
}
