package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }

    @Override
    public String toString() {
        return "HottubOnCommand";
    }
}
