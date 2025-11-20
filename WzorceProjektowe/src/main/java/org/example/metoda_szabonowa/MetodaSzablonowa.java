package org.example.metoda_szabonowa;

public class MetodaSzablonowa {
    public static void main(String[] args) {
        KasaSamoobslogowa duzySklep = new KasaSDuzySklep();
        duzySklep.dokonajZakupu();

        System.out.println("\n");

        KasaSamoobslogowa osiedlowySklep = new KasaSSklepOsiedlowy();
        osiedlowySklep.dokonajZakupu();
    }
}
