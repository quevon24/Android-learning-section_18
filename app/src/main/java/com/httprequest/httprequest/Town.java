package com.httprequest.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by quevon24 on 06/12/2017.
 */

public class Town {

    private int id;
    // Nombre con el que viene del json
    @SerializedName("ciudades")
    private List<City> cities;

    public Town(){}

    public Town(int id, List<City> cities) {
        this.id = id;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public static City parseJSON(String response) {
        // Es llamado cuando encuentre el objeto dentro del objeto
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;
    }

}
