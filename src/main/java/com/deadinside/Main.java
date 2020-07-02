package com.deadinside;


import com.deadinside.business.Request;
import com.deadinside.business.model.Response;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        Request request = new Request();
        String response = request.sendRequest("http://www.mapquestapi.com","/geocoding/v1/address","i400L7Skbj9I5LkJXpnCaa4X3aVuaJoT","Denver,%CO");
        System.out.println(response);
        Response responses  = gson.fromJson(response,Response.class);


        //Arrays.stream(responses).forEach(System.out::println);
    }
}
