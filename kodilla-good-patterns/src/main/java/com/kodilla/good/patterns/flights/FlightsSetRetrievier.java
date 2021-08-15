package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsSetRetrievier {
    public Set<Flight> retrieve() {
        Set<Flight> flightsSet = new HashSet<Flight>();
        flightsSet.add(new Flight("Gdańsk", "Wrocław", "22315"));
        flightsSet.add(new Flight("Kraków", "Gdańsk", "21235"));
        flightsSet.add(new Flight("Lublin", "Rzeszów", "18923"));
        flightsSet.add(new Flight("Rzeszów", "Kraków", "55243"));
        flightsSet.add(new Flight("Warszawa", "Rzeszów", "11435"));
        flightsSet.add(new Flight("Poznań", "Warszawa", "43223"));
        flightsSet.add(new Flight("Poznań", "Rzeszów", "29939"));
        flightsSet.add(new Flight("Wrocław", "Katowice", "88234"));
        flightsSet.add(new Flight("Katowice", "Warszawa", "67453"));
        flightsSet.add(new Flight("Katowice", "Poznań", "22883"));
        flightsSet.add(new Flight("Warszawa", "Kraków", "99102"));
        return flightsSet;
    }
}
