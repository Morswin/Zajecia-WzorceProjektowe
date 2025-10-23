package org.example.dekorator.kawiarnia;

public class DodatkowySyrop extends Modyfikacje{
    DodatkowySyrop(BobaTea bobaTea) {
        super(bobaTea);
        nazwa = "z dodatkowym syropem";
        cena = 5.0;
    }
}
