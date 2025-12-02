package org.example.command.lab;

public class WlaczWitryneCommand implements Command{
    NeonowaWitryna neonowaWitryna;
    WlaczWitryneCommand(NeonowaWitryna neonowaWitryna) {
        this.neonowaWitryna = neonowaWitryna;
    }
    @Override
    public void wykonaj() {
        neonowaWitryna.wlacz();
    }

    @Override
    public void cofnij() {
        System.out.println("Cofanie włączenia neonowej witryny");
    }
}
