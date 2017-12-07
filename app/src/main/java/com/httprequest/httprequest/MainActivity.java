package com.httprequest.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se prepara la base url
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://samples.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Se crea la instancia al servicio
        WeatherService service = retrofit.create(WeatherService.class);

        // Se prepara la peticion
        Call<City> cityCall = service.getCity("Seville,es", "061761b9a182a97af7eda4711b7b91ad");

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
