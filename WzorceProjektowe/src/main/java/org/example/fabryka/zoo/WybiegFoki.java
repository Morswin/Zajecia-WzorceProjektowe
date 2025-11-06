package org.example.fabryka.zoo;

public class WybiegFoki extends Wybieg{
    public WybiegFoki(int ilosc) {
        this.iloscZwierzat = ilosc;
        this.nazwaZwierzecia = "foki";
    }
    @Override
    void nakarm() {
        System.out.println("Karmienie " + this.iloscZwierzat + " " + this.nazwaZwierzecia);
    }
    @Override
    void posprzataj() {
        System.out.println("Sprzątanie wybiegu: " + this.nazwaZwierzecia);
    }
}
