package org.example.kompozyt.menu;

public class Kelnerka {
    public void podajMenu() {
        Menu menu = new Menu("Wszystkie SzkolaMagii");
        Menu pancakeHouseMenu = new Menu("Pancake House SzkolaMagii");
        pancakeHouseMenu.dodaj(new PozycjaMenu("Blueberry Pancakes"));
        pancakeHouseMenu.dodaj(new PozycjaMenu("Banana Waffles"));
        pancakeHouseMenu.dodaj(new PozycjaMenu("French Toast Classic"));
        menu.dodaj(pancakeHouseMenu);
        Menu dinnerMenu = new Menu("Dinner SzkolaMagii");
        dinnerMenu.dodaj(new PozycjaMenu("Grilled Chicken with Vegetables"));
        dinnerMenu.dodaj(new PozycjaMenu("Beef Stroganoff"));
        dinnerMenu.dodaj(new PozycjaMenu("Vegetarian Lasagna"));
        Menu deseryMenu = new Menu("Desery SzkolaMagii");
        deseryMenu.dodaj(new PozycjaMenu("Chocolate Lava Cake"));
        deseryMenu.dodaj(new PozycjaMenu("Cheesecake with Raspberry Sauce"));
        deseryMenu.dodaj(new PozycjaMenu("Tiramisu"));
        dinnerMenu.dodaj(deseryMenu);
        menu.dodaj(dinnerMenu);
        Menu uJackaMenu = new Menu("U Jacka SzkolaMagii");
        uJackaMenu.dodaj(new PozycjaMenu("Burger Jacka"));
        uJackaMenu.dodaj(new PozycjaMenu("Frytki po wiejsku"));
        uJackaMenu.dodaj(new PozycjaMenu("Żeberka BBQ"));
        menu.dodaj(uJackaMenu);
        menu.drukuj();
    }
}
