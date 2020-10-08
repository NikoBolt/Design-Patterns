package com.company._9_1_Iterator._2_DinerMerger._2_Iterator;

public class Waitress {
    // Методы возвращают разные типы
    // Реализации завтраков хранятся в ArrayList
    PancakeHouseMenu pancakeHouseMenu;
    // Обеды хранятся в Array
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        // создаем каждому меню по итератору
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        // печатаем меню
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
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
