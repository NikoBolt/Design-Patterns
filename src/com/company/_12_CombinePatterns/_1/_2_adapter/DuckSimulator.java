package com.company._12_CombinePatterns._1._2_adapter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
			// Создаем по одному экземпляру каждой утки
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable decoyDuck = new DecoyDuck();

			// Создаем Goose замаскированный под Duck
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Goose Adapter");

		// Запуск симуляции
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(decoyDuck);

			// Все работает как с обычным Duck
		simulate(gooseDuck);
	}

	// Перегружаем метод
	void simulate(Quackable duck) {
		duck.quack();
	}
}
