package org.example.iterator;

import java.util.Iterator;

public class CafeMenuIterator<T> implements Iterator<T> {
    private CafeMenu<T> cafeMenu;
    private int currentIndex = 0;
    public CafeMenuIterator(CafeMenu<T> cafeMenu) {
        this.cafeMenu = cafeMenu;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < cafeMenu.pozycjeMenu.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return cafeMenu.pozycjeMenu.get(currentIndex++);
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
