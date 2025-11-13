package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CafeMenu<T> implements Menu<T>{
    public ArrayList<T> pozycjeMenu;
    public CafeMenu(ArrayList<T> pozycjeMenu) {
        this.pozycjeMenu = pozycjeMenu;
    }
    @Override
    public Iterator<T> utworzIterator() {
        return new CafeMenuIterator<T>(this);
    }
}
