package org.example.adapter;

public class GamePadGameInput implements GameInput{
    GamePad gamePad;
    GamePadGameInput() {
        gamePad = new GamePad();
    }
    @Override
    public void inputEvent() {
        System.out.println(gamePad.emitujInputEvent());
    }
}
