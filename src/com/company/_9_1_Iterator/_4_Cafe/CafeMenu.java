package com.company._9_1_Iterator._4_Cafe;

import java.util.HashMap;
import java.util.Map;

public class CafeMenu {
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burgeron a whole weat bun, lettuce, tomato, and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29);
    }

    private void addItem(String name, String description,
                         boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName() /*name*/, menuItem);
    }

    public Map<String, MenuItem> getItems() {
        return menuItems;
    }
}
