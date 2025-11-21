package org.example.state;

public class StanNieMaMonety extends StanMaszyny{
    public StanNieMaMonety(int count) {
        super(count);
    }
    @Override
    public StanMaszyny wkładanieMonety() {
        System.out.println("Włożyłeś monetę");
        return new StanJestMoneta(this.liczbaGum);
    }
    @Override
    public StanMaszyny przekrecanieGalki() {
        System.out.println("Przekręciłęś gałkę do wydania gumy ale nie włożyłęś monety");
        return this;
    }
    @Override
    public StanMaszyny wydawanieGumy() {
        System.out.println("Błąd - Musisz najpierw zapłacić");
        return this;
    }
    @Override
    public StanMaszyny zwracanieMonety() {
        System.out.println("Nie włożyłeś monety");
        return new StanNieMaMonety(this.liczbaGum);
    }
    @Override
    public String ToString() {
        return "Nie Ma Monety";
    }
}
