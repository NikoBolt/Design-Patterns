package com.company._6_Command._4_RemoteControl.Commands;

import com.company._6_Command._4_RemoteControl.Objects.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public String toString() {
        return "GarageDoorDownCommand";
    }
}
