package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.City;
import ru.marinatimosh.app.model.District;
import ru.marinatimosh.app.model.Region;
import ru.marinatimosh.app.service.Service;

import java.util.List;


public class ActionController {
    private final Service service = Service.getInstance();
    private static final ActionController INSTANCE = new ActionController();

    public static ActionController getInstance() {
        return INSTANCE;
    }

    private ActionController() {
    }

 /*   public void createCitizen(int count) {
        for (int i = 0; i < count; i++) {
            citizenService.createCitizen();
        }
    }*/

/*    public List<Citizen> getCitizen() {
        return citizenService.getCitizen();

    }

    public int getCitizensAmount() {
        return citizenService.countCitizen();
    }

    public int countAverageCitizenAge() {
        return citizenService.countAverageCitizenAge();
    }*/


    public String getCountryName() {
        return service.getCountryName();
    }

    public String getCapital() {
        return service.getCapital();
    }

    public List<City> getCities() {
        return service.getCities();
    }

    public List<Region> getRegions() {
        return service.getRegions();
    }

    public List<District> getDistricts() {
        return service.getDistricts();
    }

    public int getCountryArea() {
        return service.getCountryArea();
    }

    /*public void printCityNames() {
        System.out.println("Cities in Spain:");
        String[] cities = cityService.getCity(); // Получаем массив городов один раз

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("Total number of cities: " + cities.length); // Используем длину массива
    }*/


}
