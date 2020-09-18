package com.company._6_Command._7_Party;

import com.company._6_Command._7_Party.Commands.*;
import com.company._6_Command._7_Party.Obj.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // Создание всех устройств
        Light light = new Light("Living room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
//        Hottub hottub = new Hottub("Hottub");
        Hottub hottub = new Hottub();

        // Создание комманд для управления устройствами
        // вкл
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        // выкл
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        // Массивы комманд включения и выключения
        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
        // Два объекта макрокомманд
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Готовые комманды связываются с ячейками пульта
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        // Нажимаем кнопки на пульте
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\n--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
//        remoteControl.undoButtonWasPushed();
    }
}
