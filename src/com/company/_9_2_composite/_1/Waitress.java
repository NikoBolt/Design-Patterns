package com.company._9_2_composite._1;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    /*
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
     */
    ArrayList<Menu> menus;

    public Waitress(/*Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu*/
            ArrayList<Menu> menus) {
        /*
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
         */

        this.menus = menus;
    }

    public void printMenu() {
        /*
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        //
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        //
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
        */
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator<Menu> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {}
    public void printLunchMenu() {}
    public void printVegetarianmenu() {}
    public boolean isItemVegetarian(String name) {
        return true;
    }
}
