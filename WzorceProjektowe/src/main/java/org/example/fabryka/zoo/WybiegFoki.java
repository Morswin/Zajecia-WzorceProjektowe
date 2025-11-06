package org.example.fabryka.zoo;

public class WybiegFoki extends Wybieg{
    public WybiegFoki(int ilosc) {
        this.ilosc = ilosc;
        this.nazwa = "foki";
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
