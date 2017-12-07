package com.httprequest.httprequest.API.APIServices;

import com.httprequest.httprequest.Models.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kvnza on 06-dic-17.
 */

public interface WeatherService {

    // http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);

    @GET("weather")
    Call<City> getCityCelcius(@Query("q") String city, @Query("appid") String key, @Query("units") String value);

}
