package com.company._7_2_Facade._1.Objects;

public class DvdPlayer {
    String name = "Top-O-Line DVD Player ";
    String movie;

    public void on() {
        System.out.println(name + "on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(name + "playing " + movie);
    }

    public void stop() {
        System.out.println(name + "stopped " + movie);
    }

    public void eject() {
        System.out.println(name + "eject");
    }

    public void off() {
        System.out.println(name + "off");
    }
}
