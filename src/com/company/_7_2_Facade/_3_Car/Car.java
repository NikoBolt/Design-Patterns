package com.company._7_2_Facade._3_Car;

public class Car {
    Engine engine;
    // other instance variables


    public Car() {

    }

    public void start(Key key) {
        Doors doors = new Doors();

        boolean authorized = key.turns();

        if (authorized) {
            engine.start();
            updateDashboardDisplay();
            doors.lock();
        }
    }

    public void updateDashboardDisplay() {
        // Перерисовка экрана
    }
}
