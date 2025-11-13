package org.example.kompozyt.menu;

import java.util.ArrayList;

public class Menu extends MenuComponent{
    private String nazwaMenu;
    Menu(String nazwa) {
        super();
        this.nazwaMenu = nazwa;
    }
    @Override
    public String pobierzNazwa(int poziom) {
        String ret = nazwaMenu + "\n";
        ret += super.pobierzNazwa(poziom + 1);
        return ret;
    }
}
