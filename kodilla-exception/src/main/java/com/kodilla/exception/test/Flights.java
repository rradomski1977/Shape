package com.kodilla.exception.test;

import java.util.HashSet;
import java.util.Set;

public class Flights {
    public static void main(String[] args) {
        String departureAirport = "Warsaw Airport";
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(departureAirport, "Copenhagen Airport"));
        flights.add(new Flight(departureAirport, "London City Airport"));
        flights.add(new Flight(departureAirport, "Bangkok Suvarnabhumi"));
        flights.add(new Flight(departureAirport, "Oslo Airport"));
        flights.add(new Flight(departureAirport, "Copenhagen Airport"));
        flights.add(new Flight(departureAirport, "Lisbon Airport"));
        flights.add(new Flight(departureAirport, "Stockholm Arlanda"));
        flights.add(new Flight(departureAirport, "Moscow Domodedovo"));
        flights.add(new Flight(departureAirport, "Hanoi Noi Bai Airport"));
        flights.add(new Flight(departureAirport, "Bogota Airport"));
        flights.add(new Flight(departureAirport, "Taiwan Taoyuan Airport"));
        flights.add(new Flight(departureAirport, "Hong Kong Intl Airport"));
        flights.add(new Flight(departureAirport, "Sydney International Airport"));
        FlightSchedule schedule = new FlightSchedule();
        for (Flight flight : flights) {
            try {
                System.out.printf("%s: %s\n", flight,
                        schedule.findFilght(flight) ? "NO DIRECT CONNECTION POSSIBLE" : "DIRECT CONNECTION POSSIBLE");
            } catch (RouteNotFoundException e) {
                System.out.printf("ATTENTION: %s\n", e.getMessage());
            }
        }
    }
}
