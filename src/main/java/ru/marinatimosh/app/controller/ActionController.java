package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.Citizen;
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


    public void createCitizen(int count) {
        for (int i = 0; i < count; i++) {
            service.createCitizen();
        }
    }

    public List<Citizen> getCitizens() {
        return service.getCitizens();
    }

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

    public int getAverageAgeCitizen() {
        return service.getAverageAgeCitizen();
    }

}
