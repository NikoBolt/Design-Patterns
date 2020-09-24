package com.company._8_TemplateMethod._7_Template_Method_with_Hook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
         System.out.println("Pouring into cup");
    }

    // Перехватчик. По умолчанию возвращает тру
    boolean customerWantsCondiments() {
        return true;
    }
}
