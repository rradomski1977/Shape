package com.kodilla.good.patterns.flights;

public class Main {
    public static void main(String[] args) {

        FlightsFinder flightsFinder = new FlightsFinder();

        System.out.println("\nFlights to Kraków:");
        for (Flight flight: flightsFinder.flightsTo("Kraków")) {
            System.out.println(flight);
        }

        System.out.println("\nFlights from Warszawa:");
        for (Flight flight: flightsFinder.flightsFrom("Warszawa")) {
            System.out.println(flight);
        }

        System.out.println("");
        for (ConnectingFlight connectingFlight: flightsFinder.connectingFlights("Wrocław", "Poznań")) {
            System.out.println(connectingFlight);
        }
    }
}
