package org.example.iterator;

import java.util.Iterator;

public class PancakeHouseMenu<T> implements Menu<T>{
    public T[] pozycjeMenu;
    public PancakeHouseMenu(T[] pozycjeMenu) {
        this.pozycjeMenu = pozycjeMenu;
    }
    @Override
    public Iterator<T> utworzIterator() {
        return new PancakeHouseMenuIterator<>(this);
    }
}
