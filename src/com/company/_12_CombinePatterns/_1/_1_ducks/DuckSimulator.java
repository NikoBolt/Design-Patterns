package com.company._12_CombinePatterns._1._1_ducks;

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
 
		System.out.println("\nDuck Simulator");

		// Запуск симуляции
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(decoyDuck);
	}

		// Перегружаем метод
	void simulate(Quackable duck) {
		duck.quack();
	}
}
