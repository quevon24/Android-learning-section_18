package com.httprequest.httprequest.API;

import com.google.gson.GsonBuilder;
import com.httprequest.httprequest.API.Deserializers.MyDeserializer;
import com.httprequest.httprequest.Models.City;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by quevon24 on 07/12/2017.
 */

public class API {

    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final String APPKEY = "061761b9a182a97af7eda4711b7b91ad";
    private static Retrofit retrofit = null;

    public static Retrofit getApi() {
        if (retrofit == null) {

            // Uso de deserializador
            GsonBuilder builder = new GsonBuilder();
            // registrar deserialziador para clase city
            builder.registerTypeAdapter(City.class, new MyDeserializer());

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    // Usar gson
//                    .addConverterFactory(GsonConverterFactory.create())
                    // Deserializador
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }
        return retrofit;
    }

}
