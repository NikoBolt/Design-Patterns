package com.company._12_CombinePatterns._1._4_factory;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();

			// Создаем фабрику, которая будет передаваться симулятору
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
 
	void simulate(AbstractDuckFactory duckFactory) {
		// Получает AbstractDuckFactory и использует её для создания уток
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		Quackable decoyDuck = new DecoyDuck();
			// Гусиные крики нас не интересуют, поэтому не декорируем
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Abstract Factory");

			// Запуск симуляции
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(decoyDuck);
			// Все работает как с обычным Duck
		simulate(gooseDuck);

			// Вывод данных, собранных для утковЕдов
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
