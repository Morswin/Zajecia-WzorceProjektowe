package org.example.metoda_szabonowa;

public class KasaSDuzySklep extends KasaSamoobslogowa{
    @Override
    public void skanujProdukty() {
        System.out.println("Skanowanie 20 produktów");
    }

    @Override
    public void zaplac() {
        System.out.println("Zapłata kartą. Uwzględnianie rabatu.");
    }

    @Override
    public void odlozProdukty() {
        System.out.println("Odkładanie produktów do strefy pakowania.");
        System.out.println("W strefie pakowania znajduje się niezidentyfikowany produkt.");
    }
}
