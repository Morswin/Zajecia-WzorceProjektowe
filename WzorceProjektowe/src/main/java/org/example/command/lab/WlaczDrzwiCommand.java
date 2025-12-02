package org.example.command.lab;

public class WlaczDrzwiCommand implements Command{
    DrzwiObrotowe drzwiObrotowe;
    WlaczDrzwiCommand(DrzwiObrotowe drzwiObrotowe) {
        this.drzwiObrotowe = drzwiObrotowe;
    }

    @Override
    public void wykonaj() {
        drzwiObrotowe.wlacz();
    }

    @Override
    public void cofnij() {
        System.out.println("Cofanie włączenia drzwi obrotowych.");
    }
}
