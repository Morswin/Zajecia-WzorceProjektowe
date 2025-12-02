package org.example.command.lab;

public class WylaczDrzwiCommand implements Command{
    DrzwiObrotowe drzwiObrotowe;
    WylaczDrzwiCommand(DrzwiObrotowe drzwiObrotowe) {
        this.drzwiObrotowe = drzwiObrotowe;
    }

    @Override
    public void wykonaj() {
        drzwiObrotowe.wylacz();
    }

    @Override
    public void cofnij() {
        System.out.println("Cofanie wyłączenia drzwi obrotowych.");
    }
}
