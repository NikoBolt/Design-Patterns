package com.company._12_CombinePatterns._1._6_observer;

	// Чтобы Quackable можно было бы наблюдать
public interface Quackable extends QuackObservable {
	public void quack();
}
