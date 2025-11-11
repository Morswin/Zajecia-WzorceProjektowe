package org.example.fabryka.czekoladek;

public abstract class FabrykaCzekolady {
    public abstract Czekolada produkujCzekolade();

    public Czekolada zamowCzekolade() {
        Czekolada czekolada = produkujCzekolade();
        czekolada.opisz();
        return czekolada;
    }
}
