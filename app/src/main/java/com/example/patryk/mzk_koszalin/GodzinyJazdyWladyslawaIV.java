package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GodzinyJazdyWladyslawaIV extends AppCompatActivity {


    private GodzinyArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godziny_jazdy_wladyslawa_iv);

        ListView listView = (ListView) findViewById(R.id.listView2);
//        TextView textView = (TextView) findViewById(R.id.textView2);


        Intent i = getIntent();

        int przystanek = i.getExtras().getInt("Przystanek");
        int jakieDni = i.getExtras().getInt("JakieDni");



        //  ten switch odpowiada za wybor przystanku i w jakich dniach bedzie jezdzil
        // Przykladowo
        //              Nieklonice / Wies-
        //                                  przystanek 0 - case 0
        //                                    Teraz w ifach jakie dni 0 = Dni Powszednie 1=Soboty  2 niedziela i Swieta

        switch (przystanek) {
            case 0:
//                ArrayList<Godziny> godziny = new ArrayList<>();
//                godziny.add(new Godziny("12","15","16","17"));
//                godziny.add(new Godziny("12","15","18","18"));
//                godziny.add(new Godziny("13","14","18","18"));
//                godziny.add(new Godziny("14","13","18","18"));
//
//                //ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, godziny);
//                //listView.setAdapter(arrayAdapter);
//
//               // GodzinyArrayAdapter arrayAdapter = new GodzinyArrayAdapter(getApplicationContext(), godziny);
//                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawIV));
//                listView.setAdapter(arrayAdapter);
                if (jakieDni == 0) {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesDniPowszednie));
                    listView.setAdapter(arrayAdapter);

                }
                else if (jakieDni==1) {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesSoboty));
                    listView.setAdapter(arrayAdapter);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesNiedziele));
                    listView.setAdapter(arrayAdapter);
                }



                break;
            case 1:
                if (jakieDni == 0) {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDniPowszednie));
                    listView.setAdapter(arrayAdapter);

                }
                else if (jakieDni==1) {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceSoboty));
                    listView.setAdapter(arrayAdapter);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceNiedziele));
                    listView.setAdapter(arrayAdapter);
                }


                break;


        }


    }
}
