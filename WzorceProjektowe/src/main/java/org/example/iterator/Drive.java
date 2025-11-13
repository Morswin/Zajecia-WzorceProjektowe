package org.example.iterator;

import java.util.ArrayList;

public class Drive {
    public static void main(String[] args) {
        Kelnerka<String> kelnerka = new Kelnerka<>();

        System.out.println("Menu Pancake House");
        String[] menuArray = {"Pancakes", "Waffles", "French Toast"};
        PancakeHouseMenu<String> pancakeHouseMenu = new PancakeHouseMenu<>(menuArray);
        kelnerka.drukujMenu(pancakeHouseMenu);

        System.out.println("\nMenu Cafe");
        ArrayList<String> menuArray2 = new ArrayList<>();
        menuArray2.add("Espresso");
        menuArray2.add("Cappuccino");
        menuArray2.add("Latte");
        CafeMenu<String> cafeMenu = new CafeMenu<>(menuArray2);
        kelnerka.drukujMenu(cafeMenu);
    }
}
