package org.example.obserwator.gotowe_interfejsy;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {
    public String nazwa = "Warunki Bierzące";
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof List<?>) {
            @SuppressWarnings("unchecked")
            List<Double> dane = (List<Double>) arg;
            wyswietl(dane.get(0), dane.get(1), dane.get(2));
        }
    }
    @Override
    public void wyswietl(double temp, double wilg, double cisnienie) {
        System.out.println(nazwa + " cisnienie: " + cisnienie + " wilgoc: " + wilg + " temperatura: " + temp);
    }
}
