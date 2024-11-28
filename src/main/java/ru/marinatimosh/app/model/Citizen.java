//Гражданин
package ru.marinatimosh.app.model;

import static ru.marinatimosh.app.controller.DataGenerator.*;

public class Citizen {
    private static int idCount = 1; //Счетчик id
    private long id;
    private String name;
    private String surname;
    private int age;
    private Country country;


    public Citizen() {
        this.id = idCount++;
        this.age = generateAgeCitizen();
        this.name = generateNameCitizen();
        this.surname = generateSurnameCitizen();
    }


    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
