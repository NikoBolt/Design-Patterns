package com.company._5_Singletone._6_dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {

    // высокопроизводительная реализация

    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            /* синхронизация замедляет код в 100 и более раз
            будет при первом вызове */
            synchronized (Singleton.class) /**/ {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // Условная блокировка работает только на Java 5 и выше
}
