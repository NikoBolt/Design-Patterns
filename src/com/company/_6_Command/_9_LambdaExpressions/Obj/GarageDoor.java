package com.company._6_Command._9_LambdaExpressions.Obj;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Door is open");
    }
    public void down() {}
    public void stop() {}
    public void lightOn() {}
    public void lightOff() {}
}
