package com.deadinside;

import com.deadinside.business.Request;
import com.deadinside.business.model.Location;
import com.deadinside.business.model.Response;
import com.deadinside.business.model.Results;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Config.initProperties();
        Gson gson = new Gson();
        Request request = new Request();

        System.out.println("Enter address:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String response = request.sendRequest(Config.getHostPath(),Config.getServicePath(),Config.getApiKey(),string);

        Response responses  = gson.fromJson(response,Response.class);

       Results[] results = responses.getResults();
        for (Location location : results[0].getLocations()) {
            switch (location.getGeocodeQuality())
            {
                case "POINT":
                    System.out.println("Точное положение найдено:");
                    System.out.println(location.getLatLng().toString());
                    break;
                case "ADDRESS":
                    System.out.println("Найдено расположение улици");
                    System.out.println(location.getLatLng().toString());
                    break;
                case "STREET":
                    System.out.println("Найдено расположение района");
                    System.out.println(location.getLatLng().toString());
                    break;
                case "COUNTRY":
                    System.out.println("Найдено расположение страны");
                    System.out.println(location.getLatLng().toString());
                    break;
                case "STATE":
                    System.out.println("Найдено расположение шата");
                    System.out.println(location.getLatLng().toString());
                    break;
                case "CITY":
                    System.out.println("Найдено расположение города");
                    System.out.println(location.getLatLng().toString());
                    break;
                default: System.out.println("Ничего не найдено");
            }

        }

        in.nextLine();

        //Arrays.stream(responses).forEach(System.out::println);

    }
}
 