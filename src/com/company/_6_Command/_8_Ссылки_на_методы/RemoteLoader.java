package com.company._6_Command._8_Ссылки_на_методы;

import com.company._6_Command._8_Ссылки_на_методы.Obj.CeilingFan;
import com.company._6_Command._8_Ссылки_на_методы.Obj.GarageDoor;
import com.company._6_Command._8_Ссылки_на_методы.Obj.Light;
import com.company._6_Command._8_Ссылки_на_методы.Obj.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Создание всех устройств
        // 1
        Light livingRoomLight = new Light("Living room");
        //

        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Stereo stereo = new Stereo("Living Room");

        // Удаляем весь код создания объектов Command

        // +++
        // 2
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);  // Передаем ссылки на методы
        //

        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);

        Command streoOnWithCD = () -> {
            stereo.on(); stereo.setCd(); stereo.setVolume(11);
        };

        // Пишем лямбда-выражения
        remoteControl.setCommand(3, streoOnWithCD, stereo::off);
        remoteControl.setCommand(4, garageDoor::up, garageDoor::down);
/**/
        // Нажимаем кнопки на пульте
        System.out.println(remoteControl);
        // 3
        remoteControl.onButtonWasPushed(0);
        //
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
