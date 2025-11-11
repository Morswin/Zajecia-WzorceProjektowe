package org.example.fabryka.interfejsowUzytkownika;

public class LightThemeButton implements Button{
    @Override
    public void react() {
        System.out.println("Reacting to use of light theme button event.");
    }
}
