package com.company._2_Observer._4_Util_Observer;

import com.company._2_Observer._2_WeatherStation.CurrentConditionsDisplay;
import com.company._2_Observer._2_WeatherStation.ForecastDisplay;
import com.company._2_Observer._2_WeatherStation.StatisticsDisplay;
import com.company._2_Observer._2_WeatherStation.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
