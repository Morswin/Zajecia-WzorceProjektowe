package org.example.fabryka.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Wybieg wybieg1 = zoo.zamowWybieg(Zwierze.Emu, 6);
        Wybieg wybieg2 = zoo.zamowWybieg(Zwierze.Foka, 12);
    }
}
