package org.example.obserwator.stacja_meteorologiczna;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot{
    List<Obserwator> obserwujacy = new ArrayList<Obserwator>();
    double temp = 20.0;
    double wilg = 1.0; // ?
    double cisnienie = 1000.0;
    @Override
    public void zarejestrujObserwatora(Obserwator o) {
        obserwujacy.add(o);
    }
    @Override
    public void usunObserwatora(Obserwator o) {
        obserwujacy.remove(o);
    }
    @Override
    public void powiadomObserwatorow() {
        for (Obserwator o : obserwujacy) {
            o.aktualizacja(this.temp, this.wilg, this.cisnienie);
        }
    }
    public void ustawTemp(double temp) {
        this.temp = temp;
        powiadomObserwatorow();
    }
    public void ustawWilg(double wilg) {
        this.wilg = wilg;
        powiadomObserwatorow();
    }
    public void ustawCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
        powiadomObserwatorow();
    }
}
