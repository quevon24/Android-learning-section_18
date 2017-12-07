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
    @SerializedName("main")
    private Temperature temperature;

    public City() {}

    public City(int id, String name, Temperature temperature) {
        this.id = id;
        this.name = name;
        this.temperature = temperature;
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

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public static  Temperature parseJSON(String response){
        Gson gson = new GsonBuilder().create();
        Temperature temp = gson.fromJson(response, Temperature.class);
        return temp;
    }

}
