package com.company._9_1_Iterator._2_DinerMerger._2_Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.9);

        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potao salad",
                false,
                3.29);

        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05);

        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                false,
                3.99);

        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                false,
                3.89);
        // a couple of other Diner Menu items added here
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    // этот метод больше здесь не нужен.
    // Он раскрывает внутренюю реализацию
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public  Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
        // To test Alternating menu items, comment out above line,
        // and uncomment the line below.
        //return new AlternatingDinerMenuIterator(menuItems);
    }

    // other menu methhods here
}
