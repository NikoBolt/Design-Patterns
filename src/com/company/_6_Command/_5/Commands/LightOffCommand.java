package com.company._6_Command._5.Commands;

import com.company._6_Command._5.Obj.Light;

public class LightOffCommand implements Command {
    Light light;
//    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
//        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String toString() {
        return "LightOffCommand";
    }
}
