package org.example.command.lab;

public class Main {
    public static void main(String[] args) {
        DrzwiObrotowe drzwiObrotowe = new DrzwiObrotowe();
        WlaczDrzwiCommand wlaczDrzwiCommand = new WlaczDrzwiCommand(drzwiObrotowe);
        WylaczDrzwiCommand wylaczDrzwiCommand = new WylaczDrzwiCommand(drzwiObrotowe);
        NeonowaWitryna neonowaWitryna = new NeonowaWitryna();
        WlaczWitryneCommand wlaczWitryneCommand = new WlaczWitryneCommand(neonowaWitryna);
        WylaczWitrynaCommand wylaczWitrynaCommand = new WylaczWitrynaCommand(neonowaWitryna);
        NullCommand nullCommand = new NullCommand();
        Pilot pilot = new Pilot();
        pilot.przypisz(wlaczDrzwiCommand);
        pilot.przypisz(wylaczDrzwiCommand);
        pilot.przypisz(wlaczWitryneCommand);
        pilot.przypisz(wylaczWitrynaCommand);
        pilot.przypisz(nullCommand);

        pilot.wykonaj(0);
        pilot.wykonaj(2);
        pilot.wykonaj(1);
        pilot.wykonaj(4);
        pilot.wykonaj(3);

        pilot.cofnij();
        pilot.cofnij();
        pilot.cofnij();
        pilot.cofnij();
        pilot.cofnij();
    }
}
