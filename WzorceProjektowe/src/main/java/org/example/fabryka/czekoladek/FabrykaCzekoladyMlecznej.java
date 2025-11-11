package org.example.fabryka.czekoladek;

public class FabrykaCzekoladyMlecznej extends FabrykaCzekolady{
    @Override
    public Czekolada produkujCzekolade() {
        return new CzekoladaMleczna();
    }
}
