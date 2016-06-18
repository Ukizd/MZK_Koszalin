package com.example.patryk.mzk_koszalin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button czwarta = (Button) findViewById(R.id.button4);
        Button trzecia = (Button) findViewById(R.id.button3);
        Button pietnasta = (Button) findViewById(R.id.button15);


    }

    public void wyborCzwartejLinii(View view) {

        Intent i = new Intent(this, KierunekLinii.class);
        i.putExtra("Linia",1);
        startActivity(i);
    }

    public void wyborTrzeciejLinii(View view) {
        Intent i = new Intent(this, KierunekLinii.class);
        i.putExtra("Linia", 0);
        startActivity(i);
    }

    public void wyborPietnastejLinii(View view) {
        Intent i = new Intent(this, KierunekLinii.class);
        i.putExtra("Linia", 2);
        startActivity(i);
    }
}
