package com.company._8_TemplateMethod._5_AbstractClass;

public abstract class AbstractClass {
    // Абстрактный класс субклассируктся классами, предоставляющими реализацию операций

    // final чтоб субклассы не могли изменить последовательность шагов алгоритма
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    // реализуются субклассами
    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    void concreteOperation() {
        // реализация
    }
}
