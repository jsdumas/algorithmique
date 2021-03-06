package designpatterns.hf.behavioural.observer.weather.app;

import java.util.*;

import designpatterns.hf.behavioural.observer.weather.pattern.CurrentConditionsDisplay;
import designpatterns.hf.behavioural.observer.weather.pattern.ForecastDisplay;
import designpatterns.hf.behavioural.observer.weather.pattern.StatisticsDisplay;
import designpatterns.hf.behavioural.observer.weather.pattern.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
