package org.example.dekorator.kawiarnia;

public class Modyfikacje extends BobaTea{
    public BobaTea bobaTea;
    @Override
    public double getCena() {
        return cena + bobaTea.getCena();
    }
    @Override
    public String getNazwa() {
        return bobaTea.getNazwa()  + " " + nazwa;
    }
    @Override
    public void opisz() {
        System.out.println("Cena " + this.getNazwa() + " to: " + this.getCena());
    }
    Modyfikacje(BobaTea bobaTea) {
        this.bobaTea = bobaTea;
    }
}
