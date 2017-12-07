package com.httprequest.httprequest.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by quevon24 on 06/12/2017.
 */

public class City {

    @Expose
    private String name;
    private int id;
    private String country;
//    @SerializedName("main")
//    private Temperature temperature;

    public City() {}

    public City(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
//        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //    public Temperature getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(Temperature temperature) {
//        this.temperature = temperature;
//    }
//
//    public static  Temperature parseJSON(String response){
//        Gson gson = new GsonBuilder().create();
//        Temperature temp = gson.fromJson(response, Temperature.class);
//        return temp;
//    }

}
