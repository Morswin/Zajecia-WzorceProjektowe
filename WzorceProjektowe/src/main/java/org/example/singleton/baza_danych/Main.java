package org.example.singleton.baza_danych;

public class Main {
    public static void main(String[] args) {
        BazaDanychSingleton bazaDanychSingleton = BazaDanychSingleton.getBazaDAnychSingleton();
        bazaDanychSingleton.polacz();
    }
}
