package org.designpatterns.c02observerpattern;


import org.designpatterns.c02observerpattern.observer.CurrentConditionsDisplay;
import org.designpatterns.c02observerpattern.observer.ForecastDisplay;
import org.designpatterns.c02observerpattern.observer.StatisticsDisplay;
import org.designpatterns.c02observerpattern.subject.WeatherData;

public class WeatherORama {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 23.3f);
        weatherData.setMeasurements(30, 20, 30.2f);
        weatherData.setMeasurements(-5, 90, 29.5f);
    }
}
