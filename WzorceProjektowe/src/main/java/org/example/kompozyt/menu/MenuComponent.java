package org.example.kompozyt.menu;

import java.util.ArrayList;

public class MenuComponent {
    ArrayList<MenuComponent> children;
    MenuComponent() {
        this.children = new ArrayList<>();
    }
    public void drukuj() {
        System.out.print(this.pobierzNazwa(0));
    };
    public String pobierzNazwa(int poziom) {
        String ret = "";
        for (MenuComponent child : children) {
            for (int i = 0; i < poziom; i++) {
                ret += "  ";
            }
            ret += " - " + child.pobierzNazwa(poziom + 1);
        }
        return ret;
    }
    public void dodaj(MenuComponent menuComponent) {
        this.children.add(menuComponent);
    }
}
