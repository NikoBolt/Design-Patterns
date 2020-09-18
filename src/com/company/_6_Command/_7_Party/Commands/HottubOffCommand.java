package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.Hottub;

public class HottubOffCommand  implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
//        hottub.setTemperature(104);
//        hottub.jetsOn();
    }

    @Override
    public String toString() {
        return "HottubOffCommand";
    }
}
