package org.example.kompozyt.magia;

public class Zaklecie extends SzkolaMagiiComponent {
    private String nazwaZaklecia;
    Zaklecie(String nazwa) {
        this.nazwaZaklecia = nazwa;
    }
    @Override
    public String pobierzNazwa(int poziom) {
        return nazwaZaklecia + "\n";
    }
}
