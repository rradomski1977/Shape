package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    public static Assertions Assert;

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Continent europe = new Continent();
        Country spain = new Country(new BigDecimal("46764523"));
        Country france = new Country(new BigDecimal("67065324"));
        Country italy = new Country(new BigDecimal("60366763"));
        europe.addCountry(spain);
        europe.addCountry(france);
        europe.addCountry(italy);

        Continent africa = new Continent();
        Country kenya = new Country(new BigDecimal("47654296"));
        Country morocco = new Country(new BigDecimal("33986655"));
        Country southafrica = new Country(new BigDecimal("59622350"));
        africa.addCountry(kenya);
        africa.addCountry(morocco);
        africa.addCountry(southafrica);

        Continent asia = new Continent();
        Country india = new Country(new BigDecimal("1366745634"));
        Country china = new Country(new BigDecimal("1398567444"));
        Country mongolia = new Country(new BigDecimal("3225363"));
        africa.addCountry(india);
        africa.addCountry(china);
        africa.addCountry(mongolia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("3083998352");
        Assert.assertEquals(expectedPeople, allPeople);
    }
}
