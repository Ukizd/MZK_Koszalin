package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KierunekLinii extends AppCompatActivity {

    private int linia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kierunek_linii);
        Button wladysaw = (Button) findViewById(R.id.wladyslawa);
        Button nieklonice = (Button) findViewById(R.id.Nieklonice);

        linia = getIntent().getIntExtra("Linia",0);
        Toast.makeText(getApplicationContext(), String.valueOf(linia), Toast.LENGTH_SHORT).show();

        if (linia == 0) {
            wladysaw.setText("Władysław IV");
            nieklonice.setText("Nieklonice");
        } else if (linia == 1) {
            wladysaw.setText("Władysława IV");
            nieklonice.setText("Armi Krajowej / Bank");
        } else {
            wladysaw.setText("BoWiD");
            nieklonice.setText("Chałubińskiego");

        }

    }

    public void btnWladyslaw(View view) {
        Intent i = new Intent(this, Przystanki.class);
        i.putExtra("Linia", linia);
        i.putExtra("Kierunek", 0);
        startActivity(i);
    }

    public void btnNieklonice(View view) {
        Intent i = new Intent(this, Przystanki.class);
        i.putExtra("Linia", linia);
        i.putExtra("Kierunek", 1);
        startActivity(i);
    }
}
