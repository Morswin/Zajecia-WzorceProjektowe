package org.example.obserwator.stacja_meteorologiczna;

public interface Obserwator {
    void aktualizacja(double temp, double wilg, double cisnienie);
}
