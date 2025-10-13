package org.example.strategia.gra;

public class Przeciwnik {
    SposobAtaku sposobAtaku;
    public Przeciwnik(SposobAtaku sposob) {
        sposobAtaku = sposob;
    }
    public String opisz_atak() {
        return sposobAtaku.atakuj();
    }
}
