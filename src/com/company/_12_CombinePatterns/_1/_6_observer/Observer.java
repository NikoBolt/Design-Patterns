package com.company._12_CombinePatterns._1._6_observer;

	// Интерфейс НаблюдаТЕЛЯ,
	// которому передается реализация QuackObservable (наблюдаЕМОГО)
public interface Observer {
	public void update(QuackObservable duck);
}
