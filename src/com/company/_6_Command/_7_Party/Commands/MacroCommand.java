package com.company._6_Command._7_Party.Commands;

public class MacroCommand implements Command {
    Command[] commands;

    public  MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure
     * proper undo functionality
     */
    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }

    @Override
    public String toString() {
        return "MacroCommand";
    }
}
