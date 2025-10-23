package org.example.dekorator.kawiarnia;

public class DodatkowaBoba extends Modyfikacje{
    DodatkowaBoba(BobaTea bobaTea) {
        super(bobaTea);
        nazwa = "z dodatkową bobą";
        cena = 5.0;
    }
}
