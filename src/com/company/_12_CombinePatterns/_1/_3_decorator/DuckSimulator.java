package com.company._12_CombinePatterns._1._3_decorator;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
			// Упаковываем новые реализации в декоратор
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());

		Quackable decoyDuck = new DecoyDuck();
			// Гусиные крики нас не интересуют, поэтому не декорируем
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(decoyDuck);
		simulate(gooseDuck);

			// Вывод данных, собранных для утковЕдов
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
