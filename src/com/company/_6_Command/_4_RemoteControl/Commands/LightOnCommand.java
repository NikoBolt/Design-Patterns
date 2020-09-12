package com.company._6_Command._4_RemoteControl.Commands;

import com.company._6_Command._4_RemoteControl.Objects.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public String toString() {
        return "LightOnCommand";
    }
}
