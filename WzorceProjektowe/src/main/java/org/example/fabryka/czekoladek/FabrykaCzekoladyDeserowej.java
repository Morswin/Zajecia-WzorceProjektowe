package org.example.fabryka.czekoladek;

public class FabrykaCzekoladyDeserowej extends FabrykaCzekolady {
    @Override
    public Czekolada produkujCzekolade() {
        return new CzekoladaDeserowa();
    }
}
