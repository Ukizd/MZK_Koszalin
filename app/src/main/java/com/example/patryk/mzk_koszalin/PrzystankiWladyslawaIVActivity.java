package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PrzystankiWladyslawaIVActivity extends AppCompatActivity {

    public static final String PARAMETR = "Parametr";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przystanki_wladyslawa_iv);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> listaPrzystankow = new ArrayList<>();
        listaPrzystankow.add("Nieklonice / Wieś");
        listaPrzystankow.add("Nieklonice");
        listaPrzystankow.add("Lechicka");
        listaPrzystankow.add("Powstańców Wielkopolskich");
        listaPrzystankow.add("Armii Krajowej/ Bank");

        final ArrayList<Godziny> godziny = new ArrayList<>();




        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaPrzystankow);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(PrzystankiWladyslawaIVActivity.this, GodzinyJazdyWladyslawaIV.class);

                switch (position) {

                    case 0:
                        i.putExtra("Pierwszy", position);
                        startActivity(i);
                        break;
                    case 1:
                        i.putExtra("Pierwszy", position);
                        startActivity(i);
                        break;
                    case 2:
                        i.putExtra("Pierwszy", position);
                        startActivity(i);
                        break;
                    case 3:
                        i.putExtra("Pierwszy", position);
                        startActivity(i);
                        break;
                }



            }
        });




    }
}
