package com.company._6_Command._6_Undo_2;

import com.company._6_Command._6_Undo_2.Commands.*;
import com.company._6_Command._6_Undo_2.Obj.CeilingFan;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // Создание всех устройств
//        Light livingRoomLight = new Light("Living Room");
//
//        // Создание комманд для управления освещением
//        LightOnCommand livingRoomLightOn =
//                new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff =
//                new LightOffCommand(livingRoomLight);
//
//        // Готовые комманды связываются с ячейками пульта
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();


        // Создание всех устройств
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        // Создание комманд для управления освещением
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // Готовые комманды связываются с ячейками пульта
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
