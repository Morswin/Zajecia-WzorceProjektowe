package org.example.adapter;

public class KlawiaturaGameInput implements GameInput{
    Klawiatura klawiatura;
    public KlawiaturaGameInput() {
        klawiatura = new Klawiatura();
    }
    @Override
    public void inputEvent() {
        System.out.println(klawiatura.emitujInputEvent());
    }
}
