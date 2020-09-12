package com.company._6_Command._4_RemoteControl.Commands;

import com.company._6_Command._4_RemoteControl.Objects.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public String toString() {
        return "GarageDoorUpCommand";
    }
}
