package com.deadinside.business.model;

public class Results
{
    private ProvidedLocation providedLocation;
    private Location[] locations;

    public Results(ProvidedLocation providedLocation, Location[] locations) {
        this.providedLocation = providedLocation;
        this.locations = locations;
    }

    public ProvidedLocation getProvidedLocation() {
        return providedLocation;
    }

    public Location[] getLocations() {
        return locations;
    }
}
