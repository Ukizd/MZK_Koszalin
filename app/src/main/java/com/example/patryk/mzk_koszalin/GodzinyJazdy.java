package com.example.patryk.mzk_koszalin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GodzinyJazdy extends AppCompatActivity {


    private int linia;
    private int kierunek;
    private int przystanek;
    private int jakieDni;
    private GodzinyArrayAdapter arrayAdapter;

    TextView TVLinia,TVKierunek, TVPrzystanek, TVJakieDni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godziny_jazdy);

        ListView listView = (ListView) findViewById(R.id.listView2);
//        TextView textView = (TextView) findViewById(R.id.textView2);



        linia = getIntent().getIntExtra("Linia", 0);
        kierunek = getIntent().getIntExtra("Kierunek", 0);
        przystanek = getIntent().getIntExtra("Przystanek", 0);
        jakieDni = getIntent().getIntExtra("JakieDni", 0);


        TVLinia = (TextView) findViewById(R.id.textViewLiniaWpisz);
        TVKierunek = (TextView) findViewById(R.id.textViewKierunekWpisz);
        TVPrzystanek = (TextView) findViewById(R.id.textViewPrzystanekWpisz);
        TVJakieDni = (TextView) findViewById(R.id.textViewKursujeWWpisz);

//        TVLinia.setText("");
//        TVKierunek.setText("");
//        TVPrzystanek.setText("");
//        TVJakieDni.setText("");







        //  ten switch odpowiada za wybor przystanku i w jakich dniach bedzie jezdzil
        // Przykladowo
        //              Nieklonice / Wies-
        //                                  przystanek 0 - case 0
        //                                    Teraz w ifach jakie dni 0 = Dni Powszednie 1=Soboty  2 niedziela i Swieta

//        switch (przystanek) {
//            case 0:
////                ArrayList<Godziny> godziny = new ArrayList<>();
////                godziny.add(new Godziny("12","15","16","17"));
////                godziny.add(new Godziny("12","15","18","18"));
////                godziny.add(new Godziny("13","14","18","18"));
////                godziny.add(new Godziny("14","13","18","18"));
////
////                //ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, godziny);
////                //listView.setAdapter(arrayAdapter);
////
////               // GodzinyArrayAdapter arrayAdapter = new GodzinyArrayAdapter(getApplicationContext(), godziny);
////                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawIV));
////                listView.setAdapter(arrayAdapter);
//                if (jakieDni == 0) {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesDniPowszednie));
//                    listView.setAdapter(arrayAdapter);
//
//                }
//                else if (jakieDni==1) {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesSoboty));
//                    listView.setAdapter(arrayAdapter);
//                }
//                else {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesNiedziele));
//                    listView.setAdapter(arrayAdapter);
//                }
//
//
//
//                break;
//            case 1:
//                if (jakieDni == 0) {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDniPowszednie));
//                    listView.setAdapter(arrayAdapter);
//
//                }
//                else if (jakieDni==1) {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceSoboty));
//                    listView.setAdapter(arrayAdapter);
//                }
//                else {
//                    Toast.makeText(getApplicationContext(), "Przystanek" +String.valueOf(przystanek) + " JakieDni "+String.valueOf(jakieDni) ,Toast.LENGTH_SHORT).show();
//                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceNiedziele));
//                    listView.setAdapter(arrayAdapter);
//                }
//
//
//                break;
//
//
//        }
            switch (linia) {
                // linia 3
                case 0:
                    if (kierunek == 0) { // Wladyslawa IV
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    TVLinia.setText(String.valueOf(linia));
                                    TVKierunek.setText(String.valueOf("WładyslawaIV"));       // Tutaj Władysława IV
                                    TVPrzystanek.setText(String.valueOf("Niekłonice Wieś"));   // Tutaj Nieklonice Wies
                                    TVJakieDni.setText(String.valueOf("Dni Powszednie"));       // Tutaj Dni Powszednie
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    TVLinia.setText(String.valueOf(linia));
                                    TVKierunek.setText(String.valueOf(kierunek));       // Tutaj Władysława IV
                                    TVPrzystanek.setText(String.valueOf(przystanek));   // Tutaj Nieklonice Wies
                                    TVJakieDni.setText(String.valueOf("Soboty"));       // Tutaj Soboty
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    TVLinia.setText(String.valueOf(linia));
                                    TVKierunek.setText(String.valueOf(kierunek));       // Tutaj Władysława IV
                                    TVPrzystanek.setText(String.valueOf(przystanek));   // Tutaj Nieklonice Wies
                                    TVJakieDni.setText(String.valueOf("Niedziele i Swieta"));       // Tutaj Niedziele i Swieta
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceWiesNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    TVLinia.setText(linia);
                                    TVKierunek.setText(kierunek);       // Tutaj Władysława IV
                                    TVPrzystanek.setText(przystanek);   // Tutaj Nieklonice
                                    TVJakieDni.setText(jakieDni);       // Tutaj Dni Powszednie
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    TVLinia.setText(linia);
                                    TVKierunek.setText(kierunek);       // Tutaj Władysława IV
                                    TVPrzystanek.setText(przystanek);   // Tutaj Nieklonice
                                    TVJakieDni.setText(jakieDni);       // Tutaj Soboty
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    TVLinia.setText(linia);
                                    TVKierunek.setText(kierunek);       // Tutaj Władysława IV
                                    TVPrzystanek.setText(przystanek);   // Tutaj Nieklonice
                                    TVJakieDni.setText("Niedziele i Swieta");       // Tutaj Niedziele i Swieta
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDzalkiDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NieklonicDzialkieSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDzialkiNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDzialkiiDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDzialkiiSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDzialkiiNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDrukarniaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDrukarniaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.NiekloniceDrukarniaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;


                        }
                    } else { // Kierunek Nieklonice
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JamnenskaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JamnenskaWiesSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JamnenskaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVSikorskiegoDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVSikorskiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVSikorskiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKutrzebyDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKutrzebyNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;

                        }

                    }
                    break;
                // linia 4
                case 1:
                    if (kierunek == 0) { // Kierunek Wladyslawa IV
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ArmiiKrajowejPKPDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ArmiiKrajowejPKPSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ArmiiKrajowejPKPNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.KrakusaIWandyZwyciestwaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.KrakusaIWandyZwyciestwaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.KrakusaIWandyZwyciestwaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LechickaKolejowaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LechickaKolejowaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LechickaKolejowaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaLechickaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaLechickaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaLechickaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaMECDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaMECSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.SlowianskaMECNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;


                        }
                    } else { // Kierunek Armii Krajowej Bank
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVPetlaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.WladyslawaIVKwiatkowskiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIWladyslawaIVDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIWladyslawaIVSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIWladyslawaIVNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;

                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIJagoszewskiegoDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIJagoszewskiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIJagoszewskiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIFalataDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIFalataSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIFalataNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;

                        }

                    }
                    break;
                // linia 15
                case 2:
                    if (kierunek == 0) { // kierunek BowiD
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoCentrumEdukacjiDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoCentrumEdukacjiSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoCentrumEdukacjiNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoSzpitalDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoSzpitalSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ChalubinskiegoSzpitalNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.PilsudskiegoZubrzyckiegoDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.PilsudskiegoZubrzyckiegoSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.PilsudskiegoZubrzyckiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.OrlatLwowskichSawickiejDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.OrlatLwowskichSawickiejSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.OrlatLwowskichSawickiejNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIPolitechnikaDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIPolitechnikaSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.JanaPawlaIIPolitechnikaNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;


                        }
                    } else { // Kierunek Chalubinskiego
                        switch (przystanek) {
                            case 0:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaNordGlassDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaNordGlassSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaNordGlassNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 1:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaROMEXDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaROMEXSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.LukasiewiczaROMEXNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 2:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BochaterowWarszawyGIPODniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BochaterowWarszawyGIPOSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BochaterowWarszawyGIPONiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;

                            case 3:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiDKospelDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiDKospelSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiDKospelNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;
                            case 4:
                                if (jakieDni == 0) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiDRoyalGreenlandDniPowszednie));
                                    listView.setAdapter(arrayAdapter);
                                } else if (jakieDni == 1) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BoWiDRoyalGreenlandSoboty));
                                    listView.setAdapter(arrayAdapter);
                                } else {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.PilsudskiegoZubrzyckiegoNiedziele));
                                    listView.setAdapter(arrayAdapter);
                                }
                                break;

                        }

                    }
                    break;

            }

    }
}
