package org.example.fabryka.zoo;

public class WybiegEmu extends Wybieg {
    public WybiegEmu(int ilosc) {
        this.ilosc = ilosc;
        this.nazwa = "emu";
    }
    @Override
    void nakarm() {
        System.out.println("Karmienie " + this.ilosc + " " + this.nazwa);
    }
    @Override
    void posprzataj() {
        System.out.println("Sprzątanie wybiegu: " + this.nazwa);
    }
}
