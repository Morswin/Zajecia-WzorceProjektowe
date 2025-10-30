package org.example.obserwator.gotowe_interfejsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatystykaWyswietl implements Observer, WyswietlElement {
    public String nazwa = "Statystyka";
    List<Double> pomiarTemp = new ArrayList<Double>();
    List<Double> pomiarWilg = new ArrayList<Double>();
    List<Double> pomiarCisnienie = new ArrayList<Double>();
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof List<?>) {
            @SuppressWarnings("unchecked")
            List<Double> dane = (List<Double>) arg;
            pomiarTemp.add(dane.get(0));
            pomiarWilg.add(dane.get(1));
            pomiarCisnienie.add(dane.get(2));
            double sumaTemp = 0.0;
            for (double t : pomiarTemp) {
                sumaTemp += t;
            }
            double sumaWilg = 0.0;
            for (double w : pomiarWilg) {
                sumaWilg += w;
            }
            double sumaCisnienie = 0.0;
            for (double c : pomiarCisnienie) {
                sumaCisnienie += c;
            }
            wyswietl(sumaTemp / pomiarTemp.size(), sumaWilg / pomiarWilg.size(), sumaCisnienie / pomiarCisnienie.size());
        }
    }
    @Override
    public void wyswietl(double temp, double wilg, double cisnienie) {
        System.out.println(nazwa + " cisnienie: " + cisnienie + " wilgoc: " + wilg + " temperatura: " + temp);
    }
}
