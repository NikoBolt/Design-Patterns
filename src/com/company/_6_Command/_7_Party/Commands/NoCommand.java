package com.company._6_Command._7_Party.Commands;

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
