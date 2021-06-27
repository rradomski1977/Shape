package com.kodilla.rps;

public class Paper implements Thing{

    public String getThingName() {
        return "You chose -> paper";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}

