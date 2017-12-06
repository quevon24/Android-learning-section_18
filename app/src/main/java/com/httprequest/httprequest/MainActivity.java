package com.httprequest.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{ id: 1, name: 'London', yo: 'tu' }";

        City city = null;

        // Forma nativa con Java
        try {

            JSONObject mJson = new JSONObject(json);

            int id = mJson.getInt("id");
            String name = mJson.getString("name");

            city = new City(id, name);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Toast.makeText(this, city.getId() + " -- " + city.getName(), Toast.LENGTH_LONG).show();

        // Forma con GSON, excluir variable de clase
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        City city1 = gson.fromJson(json, City.class);
        Toast.makeText(this, city1.getId() + " -- " + city1.getName(), Toast.LENGTH_LONG).show();
    }
}
