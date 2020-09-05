package com.company._2_Observer._4_Util_Observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
//    private WeatherData weatherData;

//    public ForecastDisplay(WeatherData weatherData) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//
//        display();
//    }
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}