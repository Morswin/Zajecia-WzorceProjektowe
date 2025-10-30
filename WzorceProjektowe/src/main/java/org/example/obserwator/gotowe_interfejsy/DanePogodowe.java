package org.example.obserwator.gotowe_interfejsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DanePogodowe extends Observable {
    List<Observer> obserwujacy = new ArrayList<Observer>();
    double temp = 20.0;
    double wilg = 1.0; // ?
    double cisnienie = 1000.0;
    @Override
    public void addObserver(Observer o) {
        obserwujacy.add(o);
    }
    @Override
    public void deleteObserver(Observer o) {
        obserwujacy.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : obserwujacy) {
            o.update(this, List.of(this.temp, this.wilg, this.cisnienie));
        }
    }
    public void ustawTemp(double temp) {
        this.temp = temp;
        notifyObservers();
    }
    public void ustawWilg(double wilg) {
        this.wilg = wilg;
        notifyObservers();
    }
    public void ustawCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
        notifyObservers();
    }
}
