package com.company._7_2_Facade._1.Objects;

public class TheaterLights {
    String name = "Theater Ceiling ";

    public void dim(int i) {
        System.out.println(name + "Lights dimming to 10%");
    }

    public void on() {
        System.out.println(name + "Lights on");
    }
}
