package com.company._12_CombinePatterns._1._6_observer;

// Фабрика уток, декорированных счетсиком криков
public class CountingDuckFactory extends AbstractDuckFactory {
	// Теперь ученые могут быть уверены, что каждый кряк будет посчитан
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
