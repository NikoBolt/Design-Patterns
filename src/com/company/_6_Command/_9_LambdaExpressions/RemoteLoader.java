package com.company._6_Command._9_LambdaExpressions;

import com.company._6_Command._9_LambdaExpressions.Obj.CeilingFan;
import com.company._6_Command._9_LambdaExpressions.Obj.GarageDoor;
import com.company._6_Command._9_LambdaExpressions.Obj.Light;
import com.company._6_Command._9_LambdaExpressions.Obj.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Создание всех устройств
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Stereo stereo = new Stereo("Living Room");

        // Удаляем весь код создания объектов Command

        // +++
/* отключил из-за ошибки ( было 2 метода в интерфейсе Command )*/
        Command streoOnWithCD = () -> {
            stereo.on(); stereo.setCd(); stereo.setVolume(11);
        };

        // Пишем лямбда-выражения
        remoteControl.setCommand(0, () -> { livingRoomLight.on(); }, () -> { livingRoomLight.off(); } );
        remoteControl.setCommand(3, streoOnWithCD, stereo::off);
/**/
        // Нажимаем кнопки на пульте
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
    }
}
