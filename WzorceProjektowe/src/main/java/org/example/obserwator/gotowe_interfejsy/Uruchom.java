package org.example.obserwator.gotowe_interfejsy;

public class Uruchom {
    public static void main(String[] args) {
        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl();
        StatystykaWyswietl statystykaWyswietl = new StatystykaWyswietl();
        DanePogodowe danePogodowe = new DanePogodowe();

        danePogodowe.addObserver(warunkiBiezaceWyswietl);
        danePogodowe.addObserver(statystykaWyswietl);

        danePogodowe.ustawTemp(25.0);
        danePogodowe.ustawCisnienie(999.0);
        danePogodowe.ustawWilg(2.0);
    }
}
