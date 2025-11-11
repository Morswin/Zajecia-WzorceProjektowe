package org.example.fabryka.interfejsowUzytkownika;

public class AbstractFactoryRun {
    public static void main(String[] args) {
        // Tutaj uruchamiam przykład z abstract factory
        UIFactory darkThemeUIFactory = new DarkThemeUIFactory();
        Button darkThemeButton = darkThemeUIFactory.createButton();
        TextInput darkThemeTextInput = darkThemeUIFactory.createTextInput();

        UIFactory lightThemeUIFactory = new LightThemeUIFactory();
        Button lightThemeButton = lightThemeUIFactory.createButton();
        TextInput lightThemeTextInput = lightThemeUIFactory.createTextInput();
    }
}
