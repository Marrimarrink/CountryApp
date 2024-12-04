package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.City;
import ru.marinatimosh.app.model.District;
import ru.marinatimosh.app.model.Region;
import ru.marinatimosh.app.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Service {
    private final Repository repository = Repository.getInstance();
    private static final Service INSTANCE = new Service();

    public static Service getInstance() {
        return INSTANCE;
    }

    private Service() {
    }

    public List<Citizen> getCitizens() {
        return repository.getCitizens();
    }

    public String getCountryName() {
        return repository.getCountryName();
    }

    public String getCapital() {
        return repository.getCapital();
    }

    public List<City> getCities() {
        return repository.getCities();
    }

    public List<Region> getRegions() {
        return repository.getRegions();
    }

    public List<District> getDistricts() {
        return repository.getDistricts();
    }

    public int getCountryArea() {
        return repository.getCountryArea();
    }

    public void createCitizen() {
        Citizen citizen = new Citizen();
        repository.addCitizen(citizen);
    }

    public int getAverageAgeCitizen() {
        List<Citizen> citizens = repository.getCitizens();

        if (citizens == null || citizens.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Citizen citizen : citizens) {
            sum += citizen.getAge();
        }

        return (int) sum / citizens.size();
    }


    public List<Citizen> findCitizensByFirstLetter(String letter) {
        List<Citizen> citizens = repository.getCitizens();


        if (citizens == null || citizens.isEmpty()) {
            return new ArrayList<>();
        }

        List<Citizen> result = new ArrayList<>();

        for (Citizen citizen : citizens) {
            if (citizen.getName().startsWith(letter)) {
                result.add(citizen);
            }
        }

        if (result.isEmpty()) {
            throw new NoSuchElementException("Такие имена не найдены");
        }

        return result;
    }


}