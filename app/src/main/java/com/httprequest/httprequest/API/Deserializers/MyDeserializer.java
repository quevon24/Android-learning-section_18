package com.httprequest.httprequest.API.Deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.httprequest.httprequest.Models.City;

import java.lang.reflect.Type;

/**
 * Created by quevon24 on 07/12/2017.
 */

public class MyDeserializer implements JsonDeserializer<City>{

    @Override
    public City deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        int id = json.getAsJsonObject().get("id").getAsInt();
        String name = json.getAsJsonObject().get("name").getAsString();
        String country = json.getAsJsonObject().get("sys").getAsJsonObject().get("country").getAsString();

        City city = new City(id, name, country);
        return city;

    }

}
