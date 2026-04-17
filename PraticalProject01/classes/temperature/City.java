package PraticalProject01.classes.temperature;

import PraticalProject01.classes.observers.Subject;

public class City extends Subject {
    private String name;
    private double temperature;
    private double airQuality;
    private double humidity;
    private double windSpeed;

    public City(String name, double temperature, double airQuality, double humidity, double windSpeed) {
        this.name = name;
        this.temperature = temperature;
        this.airQuality = airQuality;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(double airQuality) {
        this.airQuality = airQuality;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    
    
}
