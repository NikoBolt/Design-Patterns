package com.company._10_State._1_GumballMachine;

public class GumballMachine {

    // 4 состояния автомата
    final static int SOLD_OUT = 0;      // Пуст
    final static int NO_QUARTER = 1;    // Заряжен
    final static int HAS_QUARTER = 2;   // Опустили монету
    final static int SOLD = 3;          // Шарик продан

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    // В автомат бросают монету
    public void insertQuarter() {
        // проверяем состояние и выдаем поведение
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter"); // В автомате уже есть монета
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");           // Автомат принимает монету
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");  // Автомат отклоняет монету, т.к. все шарики проданы
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");  // Следует подождать завершения операции, прежде чем бросать другую монету
        }
    }

    // Покупатель пытается вернуть монету
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned"); // Автомат возвращает монету и переходит в NO_QUARTER
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");   // Если монеты небыло, то и вернуть её невозможно
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");  // Шарик уже куплен, возврат невозможен
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");  // Если шариков небыло, то автомат не принимал монеты, значит и вернуть не может
        }
    }

    // Покупатель дергает рычаг
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");   // Покупатель дергает рычаг 2й раз, но 2й шарик он неполучит
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");    //  Сначала надо бросить монету
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");    //  Выдача невозможна, в автомате нет шариков
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");    // Выдача шарика, переход в SOLD
            state = SOLD;
            dispense();
        }
    }

    // Выдача шарика
    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot"); //  Выдать шарик
            count = count - 1;
            if (count == 0) {                               // Остались шарики?
                System.out.println("Oops, out of gumballs!");   // - Нет
                state = SOLD_OUT;                               // Перейти в SOLD_OUT
            } else {                                            // - Да
                state = NO_QUARTER;                             // Перейти в NO_QUARTER
            }
        } else if (state == NO_QUARTER) {               // Автомат выдает ошибку
            System.out.println("You need to pay first");    // Сначала надо заплатить
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");     // Шариков нет. Все проданы
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");     // Шариков нет. Монетку нельзя было кинуть
        }
    }

    // Автомат заполняется жвачкой
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
