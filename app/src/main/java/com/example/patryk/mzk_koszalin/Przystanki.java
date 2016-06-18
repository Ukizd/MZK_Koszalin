package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Przystanki extends AppCompatActivity {

    public static final String PARAMETR = "Parametr";
    private int linia;
    private int kierunek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przystanki);

        ListView listView = (ListView) findViewById(R.id.listView);

        linia = getIntent().getIntExtra("Linia", 0);
        kierunek = getIntent().getIntExtra("Kierunek", 0);

        Toast.makeText(getApplicationContext(), "Linia " +String.valueOf(linia)+ "Kierunek" + String.valueOf(kierunek), Toast.LENGTH_SHORT).show();

        switch (linia) {
            case 0:
                if (kierunek == 0) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslaIV_Linia3));
                    listView.setAdapter(arrayAdapter);
                }
                else {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Niekłonice_Linia3));
                    listView.setAdapter(arrayAdapter);
                }
                break;
            case 1:
                if (kierunek == 0) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WładysławaIV_Linia4));
                    listView.setAdapter(arrayAdapter);
                }
                else {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ArmiiKrajowejBank_Linia4));
                    listView.setAdapter(arrayAdapter);
                }
                break;
            case 2:
                if (kierunek == 0) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiD_Linia15));
                    listView.setAdapter(arrayAdapter);
                }
                else {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Chałubińskiego_Linia15));
                    listView.setAdapter(arrayAdapter);
                }

        }


//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Intent i = new Intent(Przystanki.this, WybotDniRozkladu.class );
//
//                switch (position) {
//
//                    case 0:
//                        i.putExtra("Pierwszy", position);
//                        startActivity(i);
//                        break;
//                    case 1:
//                        i.putExtra("Pierwszy", position);
//                        startActivity(i);
//                        break;
//                    case 2:
//                        i.putExtra("Pierwszy", position);
//                        startActivity(i);
//                        break;
//                    case 3:
//                        i.putExtra("Pierwszy", position);
//                        startActivity(i);
//                        break;
//                }
//
//
//
//            }
//        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Przystanki.this, WybotDniRozkladu.class );

                switch (position) {

                    case 0:
                        i.putExtra("Przystanek", position);
                        i.putExtra("Linia", linia);
                        i.putExtra("Kierunek", kierunek);
                        startActivity(i);
                        break;
                    case 1:
                        i.putExtra("Przystanek", position);
                        i.putExtra("Linia", linia);
                        i.putExtra("Kierunek", kierunek);
                        startActivity(i);
                        break;
                    case 2:
                        i.putExtra("Przystanek", position);
                        i.putExtra("Linia", linia);
                        i.putExtra("Kierunek", kierunek);
                        startActivity(i);
                        break;
                    case 3:
                        i.putExtra("Przystanek", position);
                        i.putExtra("Linia", linia);
                        i.putExtra("Kierunek", kierunek);
                        startActivity(i);
                        break;
                    case 4:
                        i.putExtra("Przystanek", position);
                        i.putExtra("Linia", linia);
                        i.putExtra("Kierunek", kierunek);
                        startActivity(i);
                        break;

                }
            }
        });




    }
}
