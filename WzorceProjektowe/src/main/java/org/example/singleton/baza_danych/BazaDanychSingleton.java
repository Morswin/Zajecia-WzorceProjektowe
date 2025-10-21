package org.example.singleton.baza_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BazaDanychSingleton {
    private static BazaDanychSingleton bazaDanychSingleton;  // Jednokrotna referencja
    public String url = "jdbc:mysql://localhost:3306/sigmastyczna_baza_danych";
    public String user = "root";
    public String password = "";
    private BazaDanychSingleton() { }  // Konstruktor
    public static BazaDanychSingleton getBazaDAnychSingleton() {  // Sposób na dostęp do singletona
        if (bazaDanychSingleton == null) {
            bazaDanychSingleton = new BazaDanychSingleton();
        }
        return bazaDanychSingleton;
    }
    public void polacz() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Połączono z bazą danych!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
