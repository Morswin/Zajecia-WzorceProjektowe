package org.example.obserwator.stacja_meteorologiczna;

public interface Podmiot {
    void zarejestrujObserwatora(Obserwator o);
    void usunObserwatora(Obserwator o);
    void powiadomObserwatorow();
}
