package org.example.fabryka.interfejsowUzytkownika;

public class DarkThemeUIFactory extends UIFactory{
    @Override
    public Button createButton() {
        Button button = new DarkThemeButton();
        button.react();
        return button;
    }

    @Override
    public TextInput createTextInput() {
        TextInput textInput = new DarkThemeTextInput();
        textInput.react();
        return textInput;
    }
}
