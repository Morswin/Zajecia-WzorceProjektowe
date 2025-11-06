package org.example.fabryka.zoo;

public class WybiegFactory {
    public Wybieg zbudujWybieg(int iloscZwierzat, Zwierze zwierze) {
        return switch (zwierze) {
            case Emu -> new WybiegEmu(iloscZwierzat);
            case Foka -> new WybiegFoki(iloscZwierzat);
            default -> throw new IllegalArgumentException("Nieznane zwierzę");
        };
    }
}
