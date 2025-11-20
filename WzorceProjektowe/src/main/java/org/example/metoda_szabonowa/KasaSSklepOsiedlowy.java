package org.example.metoda_szabonowa;

public class KasaSSklepOsiedlowy extends KasaSamoobslogowa{
    @Override
    public void skanujProdukty() {
        System.out.println("Skanowanie 4 produktów.");
    }

    @Override
    public void zaplac() {
        System.out.println("Zapłata blikiem. Uzyskano 121 punktów w aplikacji lojalnościowej na przyszłe zakupy.");
    }
}
