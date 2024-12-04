package ru.marinatimosh.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.marinatimosh.app.model.Country;

public class Tests {

    private final Country country = Country.getInstance();

    @Test
    public void testCountryName() {
        Assert.assertEquals(country.getCountryName(), "Spain");
    }

    @Test
    public void testCapital() {
        Assert.assertEquals(country.getCapital(), "Madrid");
    }

    @Test
    public void testCountryArea() {
        Assert.assertEquals(country.getCountryArea(), 506030);
    }
}
