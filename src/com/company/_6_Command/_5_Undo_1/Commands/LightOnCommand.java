package com.company._6_Command._5_Undo_1.Commands;

import com.company._6_Command._5_Undo_1.Obj.Light;

public class LightOnCommand implements Command {
    Light light;
//    int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
//        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
//        light.dim(level);
        light.off();
    }

    @Override
    public String toString() {
        return "LightOnCommand";
    }
}
