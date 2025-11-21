package org.example.state;

public class StanJestMoneta extends StanMaszyny{
    public StanJestMoneta(int count) {
        super(count);
    }
    @Override
    public StanMaszyny wkładanieMonety() {
        System.out.println("Nie możesz włożyć kolejnej monety");
        return this;
    }
    @Override
    public StanMaszyny przekrecanieGalki() {
        System.out.println("Przekręciłeś gałkę i otrzymujesz gumę");
        return new StanGumaSprzedana(this.liczbaGum);
    }
    @Override
    public StanMaszyny wydawanieGumy() {
        System.out.println("Błąd - Nie wydano gumy do żucia");
        return this;
    }
    @Override
    public StanMaszyny zwracanieMonety() {
        System.out.println("Moneta zwrócona");
        return new StanNieMaMonety(this.liczbaGum);
    }
    @Override
    public String ToString() {
        return "Jest Moneta";
    }
}
