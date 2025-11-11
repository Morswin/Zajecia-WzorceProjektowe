package org.example.fabryka.czekoladek;

public class FactoryMethod {
    public static void main(String[] args) {
        // Ta metoda to uruchamia
        FabrykaCzekoladyDeserowej fabrykaCzekoladyDeserowej = new FabrykaCzekoladyDeserowej();
        Czekolada czekoladaDeserowa = fabrykaCzekoladyDeserowej.zamowCzekolade();
        FabrykaCzekoladyMlecznej fabrykaCzekoladyMlecznej = new FabrykaCzekoladyMlecznej();
        Czekolada czekoladaMleczna = fabrykaCzekoladyMlecznej.zamowCzekolade();
    }
}
