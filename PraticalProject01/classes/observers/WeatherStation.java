package PraticalProject01.classes.observers;

import PraticalProject01.classes.temperature.City;

public class WeatherStation implements Observer{
    public void update(Subject s) {
        City city = (City) s;
        System.out.println("Cidade: " + city.getName());
        System.out.println("Temperatura Celsius: " + city.getTemperature());
        System.out.println("Qualidade do Ar: " + city.getAirQuality());
        System.out.println("Umidade: " + city.getHumidity());
        System.out.println("Velocidade do Vento: " + city.getWindSpeed());
    }
}
