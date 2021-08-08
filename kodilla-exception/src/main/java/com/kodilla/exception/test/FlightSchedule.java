package com.kodilla.exception.test;

import java.util.*;

public class FlightSchedule {
    private static Map<String, Boolean> listOfAirports = new HashMap<>();

    {
        listOfAirports.put("Singapore Changi", true);
        listOfAirports.put("Tokyo Intl Haneda", true);
        listOfAirports.put("Munich Airport", false);
        listOfAirports.put("Hong Kong Intl Airport", true);
        listOfAirports.put("Zurich Airport", false);
        listOfAirports.put("Heathrow Airport", false);
        listOfAirports.put("Frankfurt Airport", false);
        listOfAirports.put("Amsterdam Schiphol", true);
        listOfAirports.put("Copenhagen Airport", false);
        listOfAirports.put("Dubai Airport", false);
        listOfAirports.put("Taiwan Taoyuan Airport", true);
        listOfAirports.put("Vienna Airport", false);
        listOfAirports.put("Cologne / Bonn Airport", false);
        listOfAirports.put("Melbourne Airport", true);
        listOfAirports.put("Madrid-Barajas Airport", false);
        listOfAirports.put("Barcelona Airport", false);
        listOfAirports.put("London City Airport", false);
        listOfAirports.put("Johannesburg", true);
        listOfAirports.put("Bangkok Suvarnabhumi", true);
        listOfAirports.put("San Francisco Airport", false);
        listOfAirports.put("Bogota Airport", true);
        listOfAirports.put("Toronto Pearson Airport", false);
        listOfAirports.put("Athens Airport", false);
        listOfAirports.put("Oslo Airport", false);
        listOfAirports.put("Delhi Airport", true);
        listOfAirports.put("Stockholm Arlanda", false);
        listOfAirports.put("New York JFK Airport", false);
        listOfAirports.put("Lisbon Airport", false);
        listOfAirports.put("Minneapolis-St Paul", true);
        listOfAirports.put("Moscow Domodedovo", false);
        listOfAirports.put("Porto Airport", false);
        listOfAirports.put("Dublin Airport", false);
        listOfAirports.put("Hanoi Noi Bai Airport", true);
        listOfAirports.put("Budapest Airport", false);
        listOfAirports.put("Brussels Airport", false);
    }

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        if (flight == null) {
            throw new IllegalArgumentException();
        }

        String arrival = flight.getArrivalAirport();
        if (!listOfAirports.containsKey(arrival)) {
            throw new RouteNotFoundException(flight);
        }
        return listOfAirports.get(arrival);
    }
}
