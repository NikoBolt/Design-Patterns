package com.company._9_1_Iterator._2_Iterator;

import java.util.ArrayList;
//import java.util.List;

public class PancakeHouseMenu /*implements Menu*/{
    ArrayList<MenuItem> menuItems;
//    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description,
                         boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // этот метод больше здесь не нужен.
    // Он раскрывает внутренюю реализацию
//    public List<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    public  Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

    // другие методы
//    public String toString() {
//        return "Objectville Pancake House Menu";
//    }
}
