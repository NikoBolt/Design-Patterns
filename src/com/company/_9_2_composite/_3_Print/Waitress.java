package com.company._9_2_composite._3_Print;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printBreakfastMenu() {}
    public void printLunchMenu() {}
    public void printVegetarianmenu() {}
    public boolean isItemVegetarian(String name) {
        return true;
    }
}
