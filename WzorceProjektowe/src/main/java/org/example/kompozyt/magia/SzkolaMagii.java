package org.example.kompozyt.magia;

public class SzkolaMagii extends SzkolaMagiiComponent {
    private String nazwaSzkoly;
    SzkolaMagii(String nazwa) {
        super();
        this.nazwaSzkoly = nazwa;
    }
    @Override
    public String pobierzNazwa(int poziom) {
        String ret = nazwaSzkoly + "\n";
        ret += super.pobierzNazwa(poziom + 1);
        return ret;
    }
}
