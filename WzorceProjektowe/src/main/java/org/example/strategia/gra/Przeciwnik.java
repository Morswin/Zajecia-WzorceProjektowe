package org.example.strategia.gra;

import org.example.strategia.gra.strategie.SposobAtaku;

public class Przeciwnik {
    SposobAtaku sposobAtaku;
    public Przeciwnik(SposobAtaku sposob) {
        sposobAtaku = sposob;
    }
    public String opisz_atak() {
        return sposobAtaku.atakuj();
    }
}
