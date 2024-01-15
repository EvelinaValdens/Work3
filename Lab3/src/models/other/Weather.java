package models.other;

import enums.Seasons;
import enums.WeatherStatus;
import exceptions.SeasonException;

public class Weather {
    private int temperature;
    private WeatherStatus skyCondition;
    public Weather(int temperature, WeatherStatus skyCondition) {
        this.temperature = temperature;
        this.skyCondition = skyCondition;
    }
    public void displayWeather(Seasons season) {
        if (season.equals(Seasons.SUMMER)){
            System.out.println("На улице потеплело, " + season +  " еще не сдавало позиции.");
        } else {
            throw new SeasonException("Время года не лето, ничего не произошло.");
        }
        System.out.println("Небо было голубым и " + skyCondition + ", температура " + temperature + " градуса.");
    }
}
