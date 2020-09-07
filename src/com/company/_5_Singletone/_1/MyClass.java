package com.company._5_Singletone._1;

public class MyClass {
    private MyClass(){}

    public static MyClass getInstance() {
        return new MyClass();
    }
}
