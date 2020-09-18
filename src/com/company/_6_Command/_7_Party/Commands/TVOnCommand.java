package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }

    @Override
    public String toString() {
        return "TVOnCommand";
    }
}
