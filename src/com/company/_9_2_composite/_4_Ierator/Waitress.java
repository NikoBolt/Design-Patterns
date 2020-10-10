package com.company._9_2_composite._4_Ierator;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    /*public boolean isItemVegetarian(String name) {
        return true;
    }*/

    //
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n---");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) { // метод вызывается у всех. Объекты Menu инициируют исключение
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}    // Игнорируем исключение от Menu
        }
    }

    public void printBreakfastMenu() {}

    public void printLunchMenu() {}
}
