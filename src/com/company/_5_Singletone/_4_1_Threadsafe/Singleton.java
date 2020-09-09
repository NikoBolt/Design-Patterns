package com.company._5_Singletone._4_1_Threadsafe;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here
    // Другие переменные экземпляра

    private Singleton() {}

    public static /* синхронизация замедляет код в 100 и более раз */ synchronized /**/ Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Другие методы
    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }

    // Простое и заведомо рабочее решение.
    // Хорошо подходит для задач, в которых нет проблем с быстродействием
}
