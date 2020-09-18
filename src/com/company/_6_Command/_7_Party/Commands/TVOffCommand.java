package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
//        tv.setInputChannel();
    }

    @Override
    public String toString() {
        return "TVOffCommand";
    }
}
