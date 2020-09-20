package com.company._8_TemplateMethod._6_AbstractClasss_with_hook;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();

        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        // реализация
    }

    // Метод перехватчик
    // ничего не делает. Субклассы могут переопределять, если надо
    void hook() {}
}
