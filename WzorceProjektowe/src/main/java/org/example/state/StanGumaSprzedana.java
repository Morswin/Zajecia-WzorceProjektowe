package org.example.state;

public class StanGumaSprzedana extends StanMaszyny{
    public StanGumaSprzedana(int count) {
        super(count);
    }
    @Override
    public StanMaszyny wkładanieMonety() {
        System.out.println("Proszę czekać na zakończenie poprzedniej operacji czyli wydania gumy");
        return this;
    }
    @Override
    public StanMaszyny przekrecanieGalki() {
        System.out.println("Dwukrotne przekręcenie gałki nie da ci kolejnej gumy!");
        return this;
    }
    @Override
    public StanMaszyny wydawanieGumy() {
        System.out.println("Guma wysuwa się z automatu");
        this.liczbaGum = this.liczbaGum - 1;
        if (this.liczbaGum == 0) {
            System.out.println("Ups, brak kulek gumowych!");
            StanMaszyny temp = new StanBrakGum(this.liczbaGum);
            return temp.uzupelnijGumy(10);
        }
        else {
            return new StanNieMaMonety(this.liczbaGum);
        }
    }
    @Override
    public StanMaszyny zwracanieMonety() {
        System.out.println("Już przekręciłeś gałkę i wydano gumę, nie można już zwrócić moenety");
        return new StanNieMaMonety(this.liczbaGum);
    }
    @Override
    public String ToString() {
        return "Guma Sprzedana";
    }
}
