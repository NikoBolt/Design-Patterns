package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }

    @Override
    public String toString() {
        return "StereoOnCommand";
    }
}
