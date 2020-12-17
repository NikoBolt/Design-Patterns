package com.company._12_CombinePatterns._1._5_composite;

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
		// Гусиные крики нас не интересуют, поэтому не декорируем
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Composite - Flocks");

			// Создаем стаю и заполняем утками
		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

			// Создаем 2ю стаю для Муллардов
		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

			// Добавляем 2ю стаю в первую
		flockOfDucks.add(flockOfMallards);

			// Тестируем всю стаю
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

			// А теперь только 2ю
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

			// Вывод данных, собранных для утковЕдов
		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
