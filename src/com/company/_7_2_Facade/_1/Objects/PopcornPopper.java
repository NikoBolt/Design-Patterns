package com.company._7_2_Facade._1.Objects;

public class PopcornPopper {
    String name = "Popper ";

    public void on() {
        System.out.println(name + "Popper on");
    }

    public void pop() {
        System.out.println(name + "Popper popping popcorn!");
    }

    public void off() {
        System.out.println(name + "Popper off");
    }
}
