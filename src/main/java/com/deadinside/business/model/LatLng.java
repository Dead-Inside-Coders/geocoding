package com.deadinside.business.model;

public class LatLng
{
    private double lat;
    private double lng;

    public LatLng(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "долгота = " + lat + "\n"+
                "широта = " + lng ;
    }
}
