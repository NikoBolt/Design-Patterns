package com.company._9_1_Iterator._2_Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        // создаем меню
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // отдаем официантке
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // печатаем
        waitress.printMenu();
    }
}
