package org.example.kompozyt.magia;

import java.util.ArrayList;

public class SzkolaMagiiComponent {
    ArrayList<SzkolaMagiiComponent> children;
    SzkolaMagiiComponent() {
        this.children = new ArrayList<>();
    }
    public void drukuj() {
        System.out.print(this.pobierzNazwa(0));
    };
    public String pobierzNazwa(int poziom) {
        String ret = "";
        for (SzkolaMagiiComponent child : children) {
            for (int i = 0; i < poziom; i++) {
                ret += "  ";
            }
            ret += " - " + child.pobierzNazwa(poziom + 1);
        }
        return ret;
    }
    public void dodaj(SzkolaMagiiComponent szkolaMagiiComponent) {
        this.children.add(szkolaMagiiComponent);
    }
}
