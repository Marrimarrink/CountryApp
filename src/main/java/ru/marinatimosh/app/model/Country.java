//Государство
package ru.marinatimosh.app.model;

import ru.marinatimosh.app.controller.DataGenerator;

import static ru.marinatimosh.app.controller.DataGenerator.*;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private static final Country INSTANCE = new Country();
    private final String name;
    private final int area;
    private final String capital;
    private List<Citizen> citizens = new ArrayList<>();
    private List<Region> regions;
    private List<District> districts;
    private List<City> cities;


    private Country() {
        this.name = "Spain";
        this.capital = "Madrid";
        this.area = 506030;
        this.cities = generateCities();
        this.regions = generateRegions();
        this.districts = generateDistricts();
    }

    public static Country getInstance() {
        return INSTANCE;
    }

    public String getCountryName() {
        return name;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }


    public List<City> getCities() {
        return cities;
    }

    public String getCapital() {
        return capital;
    }


    public List<Region> getRegions() {
        return regions;
    }


    public List<District> getDistricts() {
        return districts;
    }

    public int getCountryArea() {
        return area;
    }
}