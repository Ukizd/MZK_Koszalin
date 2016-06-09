package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GodzinyJazdyWladyslawaIV extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godziny_jazdy_wladyslawa_iv);

        ListView listView = (ListView) findViewById(R.id.listView2);
//        TextView textView = (TextView) findViewById(R.id.textView2);


        Intent i = getIntent();

        int ii = i.getExtras().getInt("Pierwszy");

//        textView.setText(String.valueOf(ii));

        switch (ii) {
            case 0:
                ArrayList<String> godziny = new ArrayList<>();
                godziny.add("      10.25");
                godziny.add("      11.25");

                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, godziny);
                listView.setAdapter(arrayAdapter);
                break;
            case 1:
                ArrayList<String> godziny1 = new ArrayList<>();
                godziny1.add("     11.04");
                godziny1.add("     12.04");
                ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, godziny1);
                listView.setAdapter(arrayAdapter1);
                break;


        }


    }
}
