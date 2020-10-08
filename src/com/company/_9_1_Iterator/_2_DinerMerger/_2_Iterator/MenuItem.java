package com.company._9_1_Iterator._2_DinerMerger._2_Iterator;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

//    public String toString() {
//        return (name + ", $" + price + "\n   " + description);
//    }

//    public void print() {
//        System.out.print("  " + getName());
//        if (isVegetarian()) {
//            System.out.print("(v)");
//        }
//        System.out.println(", " + getPrice());
//        System.out.println("     -- " + getDescription());
//    }
}
