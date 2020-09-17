package com.company._6_Command._5.Commands;

public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "NoCommand";
    }
}
