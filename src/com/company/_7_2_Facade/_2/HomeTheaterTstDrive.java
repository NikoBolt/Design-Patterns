package com.company._7_2_Facade._2;

import com.company._7_2_Facade._2.Objects.*;

public class HomeTheaterTstDrive {
    public static void main(String[] args) {
        // Создание экземпляров компонентов
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        homTheater.watchMovie("\"Raiders of the Lost Ark\"");
        homTheater.endMovie();
    }
}
