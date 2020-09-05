package com.company._2_Observer._1;

public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;

	CurrentConditionsDisplay currentContitionsDisplay = new CurrentConditionsDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();


		currentContitionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
