package com.deadinside.business.model;

public class DisplayLatLng
{
    private double lat;
    private double lng;

    public DisplayLatLng(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
