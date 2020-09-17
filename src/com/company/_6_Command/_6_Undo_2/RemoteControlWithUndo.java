package com.company._6_Command._6_Undo_2;

import com.company._6_Command._6_Undo_2.Commands.*;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand; // Переменная для хранения последней выполненной комманды

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];     // При нажатии кнопки мы сначала читаем комманду и выполняем её, а затем сохраняем ссылку на нее в переменной undoCommand
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];    //     --//--
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();     // При нажатии кнопки отмены мы вызываем метод undo() команды, хранящейсяв в переменной undoCommand. Вызов отменяет операцию последней выполненной команды.
    }

//    public String toString() {
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("\n------ Remote Control -------\n");
//        for (int i = 0; i < onCommands.length; i++) {
//            stringBuffer.append("[slot " + i + "] " + onCommands[i].toString() + "\t\t\t" + offCommands[i].toString() + "\n");
//        }
//        stringBuffer.append("[undo] " + undoCommand.toString() + "\n");
//        return stringBuffer.toString();
//    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
