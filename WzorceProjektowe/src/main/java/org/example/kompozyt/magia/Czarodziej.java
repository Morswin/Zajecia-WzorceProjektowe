package org.example.kompozyt.magia;

public class Czarodziej {
    public void podajMenu() {
        SzkolaMagii menu = new SzkolaMagii("Szkoła magii");
        SzkolaMagii szkolaPrzywracania = new SzkolaMagii("Szkoła przywracania");
        szkolaPrzywracania.dodaj(new Zaklecie("Pomniejsze leczenie"));
        szkolaPrzywracania.dodaj(new Zaklecie("Usuwanie klątw"));
        szkolaPrzywracania.dodaj(new Zaklecie("Wskrzeszenie"));
        menu.dodaj(szkolaPrzywracania);
        SzkolaMagii szkolaDestrukcji = new SzkolaMagii("Szkoła destrukcji");
        szkolaDestrukcji.dodaj(new Zaklecie("Tornado"));
        szkolaDestrukcji.dodaj(new Zaklecie("Zamieć"));
        szkolaDestrukcji.dodaj(new Zaklecie("Trzęsienie ziemi"));
        SzkolaMagii szkolaDestrukcjiOgniem = new SzkolaMagii("Szkoła destrukcji ogniem");
        szkolaDestrukcjiOgniem.dodaj(new Zaklecie("Kula ognia"));
        szkolaDestrukcjiOgniem.dodaj(new Zaklecie("Ognista lanca"));
        szkolaDestrukcjiOgniem.dodaj(new Zaklecie("Kometa"));
        szkolaDestrukcji.dodaj(szkolaDestrukcjiOgniem);
        menu.dodaj(szkolaDestrukcji);
        SzkolaMagii szkolaPrzywolywania = new SzkolaMagii("Szkoła przywoływania");
        szkolaPrzywolywania.dodaj(new Zaklecie("Chowaniec"));
        szkolaPrzywolywania.dodaj(new Zaklecie("Żywiołak"));
        szkolaPrzywolywania.dodaj(new Zaklecie("Zaklęta broń"));
        menu.dodaj(szkolaPrzywolywania);
        menu.drukuj();
    }
}
