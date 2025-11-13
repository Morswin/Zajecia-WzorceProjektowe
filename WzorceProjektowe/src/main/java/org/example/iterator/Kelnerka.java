package org.example.iterator;

import java.util.Iterator;

public class Kelnerka<T> {
    public void drukujMenu(Menu<T> menu) {
        Iterator<T> menuIterator = menu.utworzIterator();
        while (menuIterator.hasNext()) {
            T nextEl = menuIterator.next();
            System.out.println("Element: " + nextEl);
        }
    }
}
