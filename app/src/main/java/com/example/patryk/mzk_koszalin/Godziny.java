package com.example.patryk.mzk_koszalin;

/**
 * Created by Kamil on 09.06.2016.
 */
public class Godziny {

    String godzina;
    String minuta;

    public Godziny(String godzina, String minuta) {
        this.godzina = godzina;
        this.minuta = minuta;
    }

    public String getGodzina() {

        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getMinuta() {
        return minuta;
    }

    public void setMinuta(String minuta) {
        this.minuta = minuta;
    }
}
