package org.example.state;

public class Maszyna {
    StanMaszyny stan;
    public Maszyna(int count) {//konstruktor pobiera informacje o początkowej liczbie gum //jeżeli jest ich więcej niż 0 automat wchodzi w stan nie ma monety - znaczy ze czeka na klienta
        if (count > 0) {
            stan = new StanNieMaMonety(count);
        }
    }
    public void wkładanieMonety() {//operacja wkładanie monety
        stan = stan.wkładanieMonety();
    }
    public void przekrecanieGalki() {//operacja przekęcanie gałki
        stan = stan.przekrecanieGalki();
        if (stan instanceof StanGumaSprzedana) {
            wydawanieGumy();
        }
    }
    public void wydawanieGumy() {//wydawanie to wewnetrzna operacja inicjowana samoczynnie przez automat //operacja wydawanie gumy- metoda wywoływana w celu wydania gumy
        stan = stan.wydawanieGumy();
    }
    public void zwracanieMonety() {//operacja zwracanie monety //przy próbie odzyskania monety przez klienta
        stan = stan.zwracanieMonety();
    }
    public void uzupelnijGumy(int numGumBalls) {
        stan = stan.uzupelnijGumy(numGumBalls);
    }
    @Override
    public String toString() {
        return "Maszyna{" +
                "stan=" + stan.ToString() +
                ", liczbaGum=" + stan.liczbaGum +
                '}';
    }
}