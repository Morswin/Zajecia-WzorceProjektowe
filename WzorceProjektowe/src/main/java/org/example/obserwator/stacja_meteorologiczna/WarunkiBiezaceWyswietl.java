package org.example.obserwator.stacja_meteorologiczna;

public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement{
    public String nazwa = "Warunki Bierzące";
    @Override
    public void aktualizacja(double temp, double wilg, double cisnienie) {
        wyswietl(temp, wilg, cisnienie);
    }
    @Override
    public void wyswietl(double temp, double wilg, double cisnienie) {
        System.out.println(nazwa + " cisnienie: " + cisnienie + " wilgoc: " + wilg + " temperatura: " + temp);
    }
}
