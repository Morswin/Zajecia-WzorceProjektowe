package org.example.dekorator.kawiarnia;

public class DodatkowyLod extends Modyfikacje{
    DodatkowyLod(BobaTea bobaTea) {
        super(bobaTea);
        nazwa = "z dodatkowym lodem";
        cena = 2.0;
    }
}
