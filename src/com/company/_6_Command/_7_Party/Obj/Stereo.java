package com.company._6_Command._7_Party.Obj;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + ": Stereo is ON");
    }

    public void off() {
        System.out.println(location + ": Stereo is OFF");
    }

    public void setCd() {
        System.out.println(location + ": Stereo is set for CD input");
    }

    public void setDvd() {}

    public void setRadio() {}

    public void setVolume() {
        System.out.println(location + ": Stereo volume set to 11");
    }
}
