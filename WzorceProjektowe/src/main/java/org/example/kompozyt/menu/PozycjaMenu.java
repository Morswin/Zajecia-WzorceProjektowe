package org.example.kompozyt.menu;

public class PozycjaMenu extends MenuComponent{
    private String nazwaPozycjiMenu;
    PozycjaMenu(String nazwa) {
        this.nazwaPozycjiMenu = nazwa;
    }
    @Override
    public String pobierzNazwa(int poziom) {
        return nazwaPozycjiMenu + "\n";
    }
}
