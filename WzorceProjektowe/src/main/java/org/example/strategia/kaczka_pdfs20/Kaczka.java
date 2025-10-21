package org.example.strategia.kaczka_pdfs20;

public class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;
    public void plywaj() {
        System.out.println("Pływanie.");
    }
    public void wyswietl() {
        System.out.println("Wyświetlanie kaczki.");
    }
    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }
    public void wykonajLec() {
        latanieInterfejs.lec();
    }
    public void ustawLatanieInterfejs(LatanieInterfejs li) {
        latanieInterfejs = li;
    }
    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
