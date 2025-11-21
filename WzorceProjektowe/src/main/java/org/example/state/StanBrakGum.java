package org.example.state;

public class StanBrakGum extends StanMaszyny{
    public StanBrakGum(int count) {
        super(count);
    }
    @Override
    public StanMaszyny wkładanieMonety() {
        System.out.println("Nie możesz włożyć monety, maszyna jest pusta - brak gum");
        return this;
    }
    @Override
    public StanMaszyny przekrecanieGalki() {
        System.out.println("Przekręciłeś gałkę, ale w automacie brak kulek gumowych");
        return this;
    }
    @Override
    public StanMaszyny wydawanieGumy() {
        System.out.println("Błąd - Nie wydano gumy do żucia");
        return this;
    }
    @Override
    public StanMaszyny zwracanieMonety() {
        System.out.println("Nie możesz zwrócić monety której nie włożyłeś");
        return new StanNieMaMonety(this.liczbaGum);
    }
    @Override
    public String ToString() {
        return "Brak Gum";
    }
}
