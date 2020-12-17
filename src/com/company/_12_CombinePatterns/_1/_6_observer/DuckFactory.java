package com.company._12_CombinePatterns._1._6_observer;

// Обычная фабрика уток
public class DuckFactory extends AbstractDuckFactory {

	// каждый метод создает конкретную разновидность утки
	// программе известно лишь то, что создается реализация Quackable
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
