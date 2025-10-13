package org.example.strategia.gra;

import org.example.strategia.gra.strategie.Dystansowo;
import org.example.strategia.gra.strategie.Magicznie;
import org.example.strategia.gra.strategie.Wrecz;

public class Gra {
    public static void main(String[] args) {
        Przeciwnik przeciwnik1 = new Przeciwnik(new Dystansowo());
        Przeciwnik przeciwnik2 = new Przeciwnik(new Wrecz());
        Przeciwnik przeciwnik3 = new Przeciwnik(new Magicznie());

        System.out.println("Przeciwnik 1:");
        System.out.println(przeciwnik1.opisz_atak());
        System.out.println("Przeciwnik 2:");
        System.out.println(przeciwnik2.opisz_atak());
        System.out.println("Przeciwnik 3:");
        System.out.println(przeciwnik3.opisz_atak());
    }
}
