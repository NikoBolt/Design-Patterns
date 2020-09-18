package com.company._6_Command._9_LambdaExpressions.Obj;

public class Stereo {
    String location;
    int volume = 0;

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
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + ": Stereo volume set to " + volume);
    }
}
