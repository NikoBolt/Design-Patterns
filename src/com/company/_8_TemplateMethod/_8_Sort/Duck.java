package com.company._8_TemplateMethod._8_Sort;

public class Duck implements Comparable {
    String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck)o;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else /*if (this.weight > otherDuck.weight)*/ {
            return 1;
        }
//        return 2;
    }
}
