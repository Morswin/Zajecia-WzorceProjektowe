package org.example.dekorator.szyfr;

public class SzyfrBaza {
    public String dane;
    public String szyfruj() {
        return dane;  // Podstawowa wersja po prostu zwraca sama siebie
    }
    SzyfrBaza(String daneWejsciowe) {
        dane = daneWejsciowe;
    }
}
