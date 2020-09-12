package com.company._6_Command._2_SimpleRemoteControl;

import com.company._6_Command._2_SimpleRemoteControl.Objects.Light;

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
