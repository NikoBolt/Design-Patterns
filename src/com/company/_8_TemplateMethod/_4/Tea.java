package com.company._8_TemplateMethod._4;

public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Pouring into cup");
    }
}