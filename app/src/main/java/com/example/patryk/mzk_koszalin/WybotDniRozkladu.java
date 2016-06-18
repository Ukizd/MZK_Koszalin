package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WybotDniRozkladu extends AppCompatActivity {

    private int linia;
    private int kierunek;
    private int przystanek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybot_dni_rozkladu);

        Button dniPowszednie = (Button) findViewById(R.id.buttonDniPowszednie);
        Button soboty = (Button) findViewById(R.id.buttonSoboty);
        Button niedzieleISwieta = (Button) findViewById(R.id.buttonNiedzieleISwieta);

        przystanek = getIntent().getIntExtra("Przystanek", 0);
        linia = getIntent().getIntExtra("Linia", 0);
        kierunek = getIntent().getIntExtra("Kierunek", 0);

        //String przystaneczek = String.valueOf(przystanek);

        dniPowszednie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), String.valueOf(przystanek),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(WybotDniRozkladu.this, GodzinyJazdy.class);

                i.putExtra("Linia", linia);
                i.putExtra("Kierunek", kierunek);
                i.putExtra("Przystanek", przystanek);
                i.putExtra("JakieDni", 0);

                startActivity(i);
            }
        });
        soboty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), String.valueOf(przystanek),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(WybotDniRozkladu.this, GodzinyJazdy.class);
                i.putExtra("Linia", linia);
                i.putExtra("Kierunek", kierunek);
                i.putExtra("Przystanek", przystanek);
                i.putExtra("JakieDni", 1);
                startActivity(i);
            }
        });

        niedzieleISwieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WybotDniRozkladu.this, GodzinyJazdy.class);
                i.putExtra("Linia", linia);
                i.putExtra("Kierunek", kierunek);
                i.putExtra("Przystanek", przystanek);
                i.putExtra("JakieDni", 2);
                startActivity(i);
            }
        });
    }
}
