package org.example.fabryka.interfejsowUzytkownika;

public class LightThemeUIFactory extends UIFactory{
    @Override
    public Button createButton() {
        Button button = new LightThemeButton();
        button.react();
        return button;
    }

    @Override
    public TextInput createTextInput() {
        TextInput textInput = new LightThemeTextInput();
        textInput.react();
        return textInput;
    }
}
