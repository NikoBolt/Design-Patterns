package com.company._12_CombinePatterns._1._4_factory;

public abstract class AbstractDuckFactory {
 		// Каждый метод создает одну разновидность уток
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
