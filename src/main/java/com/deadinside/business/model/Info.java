package com.deadinside.business.model;

public class Info
{
    private int statuscode;
    private Copyright copyright;
    //private String[] message;

    public Info(int statuscode, Copyright copyright) {
        this.statuscode = statuscode;
        this.copyright = copyright;
       // this.message = message;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public Copyright getCopyright() {
        return copyright;
    }
//
//    public String[] getMessage() {
//        return message;
//    }
}
