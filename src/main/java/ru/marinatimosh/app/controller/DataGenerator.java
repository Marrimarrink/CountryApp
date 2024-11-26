package ru.marinatimosh.app.controller;

import ru.marinatimosh.app.model.City;
import ru.marinatimosh.app.model.District;
import ru.marinatimosh.app.model.Region;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class DataGenerator {
    static String[] namesCitizen = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
            "Sanchez", "Romero", "Torres", "Fernandez", "Diaz", "Ramirez", "Cruz", "Morales",
            "Rivera", "Reyes", "Jimenez", "Castillo", "Vasquez", "Guerrero"};

    static String[] surnamesCitizen = {"Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Perez",
            "Sanchez", "Romero", "Torres", "Fernandez", "Diaz", "Ramirez", "Cruz", "Morales",
            "Rivera", "Reyes", "Jimenez", "Castillo", "Vasquez", "Guerrero"};

    static String[] nameCities = {"Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza",
            "Malaga", "Bilbao", "Cordoba", "Granada", "Toledo", "Alicante", "Cádiz", "Murcia",
            "Pamplona", "San Sebastián", "Salamanca", "Santiago de Compostela", "Oviedo", "Gijón",
            "Logroño", "Albacete", "Burgos", "Leon", "Almería", "Huelva", "Tarragona", "Cuenca"};

    static String[] nameDistricts = {"Centro", "Arganzuela", "Retiro", "Salamanca", "Chamartín", "Tetuán", "Usera",
            "Puente de Vallecas", "Moratalaz", "Ciudad Lineal", "Hortaleza", "San Blas-Canillejas", "Barajas", "Latina",
            "Carabanchel", "Moncloa-Aravaca", "Chamberí", "Villaverde", "Fuencarral-El Pardo", "Gracia", "Sants-Montjuïc",
            "Sant Martí", "Les Corts", "Eixample", "Nou Barris", "Horta-Guinardó", "Sant Andreu", "Sant Boi de Llobregat",
            "L'Hospitalet de Llobregat", "Badalona", "Cornellà de Llobregat", "Mataró", "Sabadell", "Terrassa", "Alcalá de Henares",
            "Getafe", "Leganés", "Pontevedra", "A Coruña", "Vigo", "Sevilla", "Córdoba", "Málaga", "Bilbao", "Donostia-San Sebastián",
            "Pamplona", "Logroño", "Albacete", "Burgos", "Salamanca", "Santiago de Compostela", "Oviedo", "Gijón", "Murcia", "Tarragona",
            "Lleida", "Jaén", "Granada", "Zaragoza", "Almería", "Cádiz"};

    static String[] nameRegions = {"Andalusia", "Catalonia", "Madrid", "Valencia", "Basque Country",
            "Galicia", "Castile and León", "Castile-La Mancha", "Aragon", "Murcia", "Extremadura",
            "Asturias", "Balearic Islands", "Canary Islands", "Navarre", "La Rioja", "Ceuta", "Melilla",
            "Catalonia", "Community of Valencia"};


    public static int generateAgeCitizen() {
        int min = 18;
        int max = 95;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static String generateNameCitizen() {
        Random random = new Random();
        int index = random.nextInt(namesCitizen.length);
        return namesCitizen[index];
    }

    public static String generateSurnameCitizen() {
        Random random = new Random();
        int index = random.nextInt(surnamesCitizen.length);
        return surnamesCitizen[index];
    }


    public static List<City> generateCities() {
        List<City> cities = new ArrayList<>();
        for (String name : nameCities) {
            cities.add(new City(name));
        }
        return cities;
    }

    public static List<Region> generateRegions() {
        List<Region> regions = new ArrayList<>();
        for (String name : nameRegions) {
            regions.add(new Region(name));
        }
        return regions;
    }

    public static List<District> generateDistricts() {
        List<District> districts = new ArrayList<>();
        for (String name : nameDistricts) {
            districts.add(new District(name));
        }
        return districts;
    }

}



