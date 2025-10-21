package org.example.singleton.singleton_strategia;

import org.example.singleton.singleton_strategia.strategie.SposobAtaku;

public class Przeciwnik {
    SposobAtaku sposobAtaku;
    public Przeciwnik(SposobAtaku sposob) {
        sposobAtaku = sposob;
    }
    public String opisz_atak() {
        return sposobAtaku.atakuj();
    }
}
