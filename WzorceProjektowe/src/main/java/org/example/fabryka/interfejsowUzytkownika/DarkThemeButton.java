package org.example.fabryka.interfejsowUzytkownika;

public class DarkThemeButton implements Button{
    @Override
    public void react() {
        System.out.println("Reacting to use of dark theme button event.");
    }
}
