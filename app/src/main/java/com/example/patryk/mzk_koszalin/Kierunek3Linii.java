package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Kierunek3Linii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kierunek3_linii);
        Button wladysaw = (Button) findViewById(R.id.wladyslawa);
        Button nieklonice = (Button) findViewById(R.id.Nieklonice);
    }

    public void btnWladyslaw(View view) {
        Intent i = new Intent(this, PrzystankiWladyslawaIVActivity.class);
        startActivity(i);
    }

    public void btnNieklonice(View view) {
        Intent i = new Intent(this, PrzystankiNiekloniceActivity.class);
        startActivity(i);
    }
}
