package org.example.singleton.singleton_strategia;

import org.example.singleton.singleton_strategia.strategie.Dystansowo;
import org.example.singleton.singleton_strategia.strategie.Magicznie;
import org.example.singleton.singleton_strategia.strategie.Wrecz;

public class Gra {
    public static void main(String[] args) {
        SystemRPG systemRPG = SystemRPG.zainicjujSystem();
        systemRPG = SystemRPG.zainicjujSystem(); // Tutaj nic się nie zmieni, bo to singleton
        systemRPG.rzutNaInicjatywe();

        Przeciwnik przeciwnik1 = new Przeciwnik(new Dystansowo());
        Przeciwnik przeciwnik2 = new Przeciwnik(new Wrecz());
        Przeciwnik przeciwnik3 = new Przeciwnik(new Magicznie());

        System.out.println("Przeciwnik 1:");
        System.out.println(przeciwnik1.opisz_atak());
        System.out.println("Przeciwnik 2:");
        System.out.println(przeciwnik2.opisz_atak());
        System.out.println("Przeciwnik 3:");
        System.out.println(przeciwnik3.opisz_atak());

        przeciwnik1.sposobAtaku = new Wrecz();
        System.out.println("Przeciwnik 1 po zmianie:");
        System.out.println(przeciwnik1.opisz_atak());
    }
}
