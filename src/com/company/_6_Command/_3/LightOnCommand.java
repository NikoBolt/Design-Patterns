package com.company._6_Command._3;

import com.company._6_Command._3.Objects.Light;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
