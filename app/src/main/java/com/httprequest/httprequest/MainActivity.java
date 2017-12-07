package com.httprequest.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.httprequest.httprequest.API.API;
import com.httprequest.httprequest.API.APIServices.WeatherService;
import com.httprequest.httprequest.Models.City;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se crea la instancia al servicio
        WeatherService service = API.getApi().create(WeatherService.class);

        // Se prepara la peticion
        Call<City> cityCall = service.getCityCelcius("Seville,es", API.APPKEY, "metric");

        // se agrega en una cola y hace una llamada asincrona
        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                // peticion exitosa
                // city ya parseado con gson
                City city = response.body();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                // fallo en la peticion
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        });



    }
}
