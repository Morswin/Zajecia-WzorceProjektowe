package org.example.fasada;

public class SmartHouse {
    Klimatyzacja klimatyzacja;
    Oswietlenie oswietlenie;
    Rolety rolety;
    SmartHouse() {
        klimatyzacja = new Klimatyzacja();
        oswietlenie = new Oswietlenie();
        rolety = new Rolety();
    }
    public void trybDzienny() {
        System.out.println("Smart House wchodzi w tryb dzienny:");
        klimatyzacja.trybDzienny();
        oswietlenie.wylacz();
        rolety.podnies();
    }
    public void trybNocny() {
        System.out.println("Smart House wchodzi w tryb nocny:");
        klimatyzacja.trybNocny();
        oswietlenie.wlacz();
        rolety.opusc();
    }
}
