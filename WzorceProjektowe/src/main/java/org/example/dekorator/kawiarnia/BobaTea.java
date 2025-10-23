package org.example.dekorator.kawiarnia;

public class BobaTea {
    public double cena;
    public String nazwa;
    public double getCena() {
        return cena;
    }
    public String getNazwa() {
        if (nazwa == null) {
            return "BobaTea";
        }
        return nazwa;
    }
    public void opisz() {
        System.out.println("Cena " + this.getNazwa() + " to: " + this.getCena());
    }
}
