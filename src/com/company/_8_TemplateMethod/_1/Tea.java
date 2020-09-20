package com.company._8_TemplateMethod._1;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Pouring into cup");
    }
}
