package com.deadinside.business.model;

public class Location
{
    private String street;
    private String adminArea6;
    private String adminArea6Type;
    private String adminArea5;
    private String adminArea5Type;
    private String adminArea4;
    private String adminArea4Type;
    private String adminArea3;
    private String adminArea3Type;
    private String adminArea1;
    private String adminArea1Type;
    private String postalCode;
    private String geocodeQualityCode;
    private String geocodeQuality;
    private boolean dragPoint;
    private String sideOfStreet;
    private String linkId;
    private String unknownInput;
    private String type;
    private LatLng latLng;
    private DisplayLatLng displayLatLng;
    private String mapUrl;

    public Location(String street, String adminArea6, String adminArea6Type, String adminArea5, String adminArea5Type, String adminArea4, String adminArea4Type, String adminArea3, String adminArea3Type, String adminArea1, String adminArea1Type, String postalCode, String geocodeQualityCode, String geocodeQuality, boolean dragPoint, String sideOfStreet, String linkId, String unknownInput, String type, LatLng latLng, DisplayLatLng displayLatLng, String mapUrl) {
        this.street = street;
        this.adminArea6 = adminArea6;
        this.adminArea6Type = adminArea6Type;
        this.adminArea5 = adminArea5;
        this.adminArea5Type = adminArea5Type;
        this.adminArea4 = adminArea4;
        this.adminArea4Type = adminArea4Type;
        this.adminArea3 = adminArea3;
        this.adminArea3Type = adminArea3Type;
        this.adminArea1 = adminArea1;
        this.adminArea1Type = adminArea1Type;
        this.postalCode = postalCode;
        this.geocodeQualityCode = geocodeQualityCode;
        this.geocodeQuality = geocodeQuality;
        this.dragPoint = dragPoint;
        this.sideOfStreet = sideOfStreet;
        this.linkId = linkId;
        this.unknownInput = unknownInput;
        this.type = type;
        this.latLng = latLng;
        this.displayLatLng = displayLatLng;
        this.mapUrl = mapUrl;
    }

    public String getStreet() {
        return street;
    }

    public String getAdminArea6() {
        return adminArea6;
    }

    public String getAdminArea6Type() {
        return adminArea6Type;
    }

    public String getAdminArea5() {
        return adminArea5;
    }

    public String getAdminArea5Type() {
        return adminArea5Type;
    }

    public String getAdminArea4() {
        return adminArea4;
    }

    public String getAdminArea4Type() {
        return adminArea4Type;
    }

    public String getAdminArea3() {
        return adminArea3;
    }

    public String getAdminArea3Type() {
        return adminArea3Type;
    }

    public String getAdminArea1() {
        return adminArea1;
    }

    public String getAdminArea1Type() {
        return adminArea1Type;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getGeocodeQualityCode() {
        return geocodeQualityCode;
    }

    public String getGeocodeQuality() {
        return geocodeQuality;
    }

    public boolean isDragPoint() {
        return dragPoint;
    }

    public String getSideOfStreet() {
        return sideOfStreet;
    }

    public String getLinkId() {
        return linkId;
    }

    public String getUnknownInput() {
        return unknownInput;
    }

    public String getType() {
        return type;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public DisplayLatLng getDisplayLatLng() {
        return displayLatLng;
    }

    public String getMapUrl() {
        return mapUrl;
    }
}
