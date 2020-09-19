package com.company._7_2_Facade._1;

import com.company._7_2_Facade._1.Objects.*;

public class HomeTheaterTstDrive {
    public static void main(String[] args) {
        // Создание экземпляров компонентов
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
//        Amplifier amp = new Amplifier("Amplifier");
//        Tuner tuner = new Tuner("AM/FM Tuner", amp);
////        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
//        CdPlayer cd = new CdPlayer("CD Player", amp);
//        Projector projector = new Projector("Projector", player);
//        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
//        Screen screen = new Screen("Theater Screen");
//        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        homTheater.watchMovie("\"Raiders of the Lost Ark\"");
        homTheater.endMovie();
    }
}
