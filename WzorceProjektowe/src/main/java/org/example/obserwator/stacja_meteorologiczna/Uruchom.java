package org.example.obserwator.stacja_meteorologiczna;

public class Uruchom {
    public static void main(String[] args) {
        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl();
        StatystykaWyswietl statystykaWyswietl = new StatystykaWyswietl();
        DanePogodowe danePogodowe = new DanePogodowe();

        danePogodowe.zarejestrujObserwatora(warunkiBiezaceWyswietl);
        danePogodowe.zarejestrujObserwatora(statystykaWyswietl);

        danePogodowe.ustawTemp(25.0);
        danePogodowe.ustawCisnienie(999.0);
        danePogodowe.ustawWilg(2.0);
    }
}
