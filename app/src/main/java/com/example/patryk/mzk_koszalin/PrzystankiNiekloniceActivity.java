package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PrzystankiNiekloniceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przystanki_nieklonice);
        ListView listView = (ListView) findViewById(R.id.listView3);

        ArrayList<String> listaPrzystankow = new ArrayList<>();
        listaPrzystankow.add("Władysława IV / Pętla");
        listaPrzystankow.add("Władysława IV / Kutrzeby");
        listaPrzystankow.add("Armii Krajowej");
        listaPrzystankow.add("Lechicka");
        listaPrzystankow.add("Monte Cassino");
        listaPrzystankow.add("Nieklonice");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaPrzystankow);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(PrzystankiNiekloniceActivity.this, WyborDniRozkladuKierunekNieklonice.class);

                i.putExtra("Pierwszy", position);
                startActivity(i);
            }
        });
    }
}
