package org.example.metoda_szabonowa;

import java.util.Scanner;

public abstract class KasaSamoobslogowa {
    public void dokonajZakupu() {
        skanujProdukty();
        odlozProdukty();
        zaplac();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Czy wydrukować potwierdzenie? (tak/nie): ");
        String wybor = scanner.nextLine().trim().toLowerCase();
        if (wybor.equals("tak")) {
            wydrukujPotwierdzenie();
        }
        wydrukujParagon();
    }
    public abstract void skanujProdukty();
    public void odlozProdukty() {
        System.out.println("Odkładanie produktów do strefy pakowania.");
    }
    public abstract void zaplac();
    public void wydrukujPotwierdzenie() {
        System.out.println("Drukowanie potwierdzenia.");
    }
    public void wydrukujParagon() {
        System.out.println("Drukowanie paragonu.");
    }
}
