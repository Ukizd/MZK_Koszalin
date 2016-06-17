package com.example.patryk.mzk_koszalin;

/**
 * Created by Kamil on 09.06.2016.
 */
public class Godziny {

    String godzina;
    String minutaDniPowszednie;
    String minutaSobota;
    String minutaSwieta;

    public Godziny(String godzina, String minutaDniPowszednie, String minutaSobota, String minutaSwieta) {
        this.godzina = godzina;
        this.minutaDniPowszednie = minutaDniPowszednie;
        this.minutaSobota = minutaSobota;
        this.minutaSwieta = minutaSwieta;
    }

    public String getGodzina() {

        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getMinutaDniPowszednie() {
        return minutaDniPowszednie;
    }

    public void setMinutaDniPowszednie(String minutaDniPowszednie) {
        this.minutaDniPowszednie = minutaDniPowszednie;
    }

    public String getMinutaSobota() {
        return minutaSobota;
    }

    public void setMinutaSobota(String minutaSobota) {
        this.minutaSobota = minutaSobota;
    }

    public String getMinutaSwieta() {
        return minutaSwieta;
    }

    public void setMinutaSwieta(String minutaSwieta) {
        this.minutaSwieta = minutaSwieta;
    }
}
