package org.example.adapter;

public class Adapter {
    public static void main(String[] args) {
        // Tutaj klient używa adaptera
        GameInput klawiatura = new KlawiaturaGameInput();
        klawiatura.inputEvent();

        GameInput gamePad = new GamePadGameInput();
        gamePad.inputEvent();
    }
}
