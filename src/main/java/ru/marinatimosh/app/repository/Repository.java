package ru.marinatimosh.app.repository;

import ru.marinatimosh.app.model.*;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final Country country = Country.getInstance();
    private static final Repository INSTANCE = new Repository();

    public static Repository getInstance() {
        return INSTANCE;
    }

    private Repository() {
    }

    public List<Citizen> getCitizens() {
        return country.getCitizens();
    }

    public String getCountryName() {
        return country.getCountryName();
    }

    public String getCapital() {
        return country.getCapital();
    }

    public List<City> getCities() {
        return country.getCities();
    }

    public List<Region> getRegions() {
        return country.getRegions();
    }

    public List<District> getDistricts() {
        return country.getDistricts();
    }

    public int getCountryArea() {
        return country.getCountryArea();
    }

    public void addCitizen(Citizen citizen) {
        country.addCitizen(citizen);
    }
}