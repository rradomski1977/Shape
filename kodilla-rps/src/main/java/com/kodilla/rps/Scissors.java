package com.kodilla.rps;

public class Scissors implements Thing {
    public String getThingName() {
        return "You chose -> scissors";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
