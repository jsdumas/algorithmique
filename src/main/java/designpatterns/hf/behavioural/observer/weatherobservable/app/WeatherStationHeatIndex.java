package designpatterns.hf.behavioural.observer.weatherobservable.app;

import designpatterns.hf.behavioural.observer.weatherobservable.pattern.CurrentConditionsDisplay;
import designpatterns.hf.behavioural.observer.weatherobservable.pattern.ForecastDisplay;
import designpatterns.hf.behavioural.observer.weatherobservable.pattern.HeatIndexDisplay;
import designpatterns.hf.behavioural.observer.weatherobservable.pattern.StatisticsDisplay;
import designpatterns.hf.behavioural.observer.weatherobservable.pattern.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
