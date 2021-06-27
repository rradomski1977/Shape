package com.kodilla.rps;

public class Stone implements Thing {
    //String name;
    public String getThingName() {
        return "You chose -> stone";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
