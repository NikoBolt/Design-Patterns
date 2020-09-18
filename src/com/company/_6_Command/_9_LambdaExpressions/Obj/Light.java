package com.company._6_Command._9_LambdaExpressions.Obj;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + ": Light is ON");
    }
    public void off() {
        System.out.println(location + ": Light is OFF");
    }
}
