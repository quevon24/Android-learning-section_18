package com.httprequest.httprequest;

/**
 * Created by quevon24 on 06/12/2017.
 */

public class City {
    public String name;
    public int id;

    public City() {}

    public City(int id, String name) {
        this.id = id;
        this.name = name;
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
}