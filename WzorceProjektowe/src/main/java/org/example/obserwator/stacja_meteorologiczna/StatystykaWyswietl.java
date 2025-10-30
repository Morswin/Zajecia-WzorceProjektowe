package org.example.obserwator.stacja_meteorologiczna;

import java.util.ArrayList;
import java.util.List;

public class StatystykaWyswietl implements Obserwator, WyswietlElement{
    public String nazwa = "Statystyka";
    List<Double> pomiarTemp = new ArrayList<Double>();
    List<Double> pomiarWilg = new ArrayList<Double>();
    List<Double> pomiarCisnienie = new ArrayList<Double>();
    @Override
    public void aktualizacja(double temp, double wilg, double cisnienie) {
        pomiarTemp.add(temp);
        pomiarWilg.add(wilg);
        pomiarCisnienie.add(cisnienie);
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
    @Override
    public void wyswietl(double temp, double wilg, double cisnienie) {
        System.out.println(nazwa + " cisnienie: " + cisnienie + " wilgoc: " + wilg + " temperatura: " + temp);
    }
}
