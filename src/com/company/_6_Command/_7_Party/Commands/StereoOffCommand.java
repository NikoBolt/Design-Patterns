package com.company._6_Command._7_Party.Commands;

import com.company._6_Command._7_Party.Obj.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }

    @Override
    public String toString() {
        return "StereoOffCommand";
    }
}
