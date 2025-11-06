package org.example.fabryka.zoo;

public class WybiegFactory {
    public Wybieg zbudujWybieg(int ilosc, Zwierze zwierze) {
        return switch (zwierze) {
            case Emu -> new WybiegEmu(ilosc);
            case Foka -> new WybiegFoki(ilosc);
            default -> throw new IllegalArgumentException("Nieznane zwierzę");
        };
    }
}
