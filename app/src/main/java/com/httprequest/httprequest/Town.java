package com.httprequest.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by quevon24 on 06/12/2017.
 */

public class Town {

    private int id;
    private City city;

    public Town(){}

    public Town(int id, City city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static City parseJSON(String response) {
        // Es llamado cuando encuentre el objeto dentro del objeto
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;
    }

}
