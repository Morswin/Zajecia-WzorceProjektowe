package org.example.iterator;

import java.util.Iterator;

public class PancakeHouseMenuIterator<T> implements Iterator<T> {
    private PancakeHouseMenu<T> pancakeHouseMenu;
    private int current_index;
    public PancakeHouseMenuIterator(PancakeHouseMenu<T> pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.current_index = 0;
    }
    @Override
    public boolean hasNext() {
        if (pancakeHouseMenu.pozycjeMenu.length > 0) {
            return current_index < pancakeHouseMenu.pozycjeMenu.length;
        }
        return false;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T temp = pancakeHouseMenu.pozycjeMenu[current_index];
            current_index += 1;
            return temp;
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
