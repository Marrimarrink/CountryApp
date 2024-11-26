package ru.marinatimosh.app.service;

import ru.marinatimosh.app.model.Citizen;
import ru.marinatimosh.app.model.City;
import ru.marinatimosh.app.model.District;
import ru.marinatimosh.app.model.Region;
import ru.marinatimosh.app.repository.Repository;

import java.util.List;

public class Service {
    private final Repository repository = Repository.getInstance();
    private static final Service INSTANCE = new Service();

    public static Service getInstance() {
        return INSTANCE;
    }

    private Service() {
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

//Исправить метод
/*    public void save(Citizen citizen) {
        citizen.setCountry(country);
        citizens.add(citizen);
    }*/


  /*  public void createCitizen() {
        Citizen citizen = new Citizen();
        repository.addCitizen(citizen);
    }*/

 /*   public List<Citizen> getCitizens() {
        return repository.getCitizens();
    }*/



  /*  public void createCitizen() {
        Citizen citizen = new Citizen();
        citizenRepository.save(citizen);
    }

    public List<Citizen> getCitizen() {
        return citizenRepository.getCitizens();
    }

    public List<Citizen> countCitizen() {
        return citizenRepository.getCitizens();
    }

    public int countAverageCitizenAge() {
        List<Citizen> citizens = citizenRepository.getCitizens();

        if (citizens.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Citizen citizen : citizens) {
            sum += citizen.getAge();
        }

        return (int) sum / citizens.size();
    }
    */


}