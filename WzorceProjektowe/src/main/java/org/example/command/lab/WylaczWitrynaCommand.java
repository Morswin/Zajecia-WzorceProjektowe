package org.example.command.lab;

public class WylaczWitrynaCommand implements Command{
    NeonowaWitryna neonowaWitryna;
    WylaczWitrynaCommand(NeonowaWitryna neonowaWitryna) {
        this.neonowaWitryna = neonowaWitryna;
    }

    @Override
    public void wykonaj() {
        neonowaWitryna.wylacz();
    }

    @Override
    public void cofnij() {
        System.out.println("Cofanie wyłączenia witryny neonowej.");
    }
}
