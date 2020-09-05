package com.company._2_Observer._2_WeatherStation.Example_Interface;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
