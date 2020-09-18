package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
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
