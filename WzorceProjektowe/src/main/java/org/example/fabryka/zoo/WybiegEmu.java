package org.example.fabryka.zoo;

public class WybiegEmu extends Wybieg {
    public WybiegEmu(int ilosc) {
        this.iloscZwierzat = ilosc;
        this.nazwaZwierzecia = "emu";
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
