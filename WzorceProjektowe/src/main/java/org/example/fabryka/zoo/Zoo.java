package org.example.fabryka.zoo;

public class Zoo {
    public Wybieg zamowWybieg(Zwierze zwierze, int ile) {
        System.out.println("Tworzę wybieg dla " + ile + " zwierząt");
        WybiegFactory wybiegFactory = new WybiegFactory();
        Wybieg wybieg = wybiegFactory.zbudujWybieg(ile, zwierze);
        System.out.println("Wykonuję czynności typu maintanence.");
        wybieg.nakarm();
        wybieg.posprzataj();
        return wybieg;
    }
}
