package com.company._6_Command._2_SimpleRemoteControl;

import com.company._6_Command._2_SimpleRemoteControl.Objects.*;

public class RemoteControlTest {
    public static void main(String [] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
