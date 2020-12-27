package com.company._12_CombinePatterns._2_MVC._1_View;
  
public interface BeatModelInterface {
	//// Методы используемые контроллером для управления моделью на основании действий пользователя
	void initialize();
  
	void on();
  	// Методы запуска и остановки генератора ритма
	void off();

	// Задает частоту ритма
    void setBPM(int bpm);
  	////

	//// Методы, при помощи которых представление и контроллер получают информацию состояния и изменяют свой статус наблюдателя
		// Возвращает текущую частоту
	int getBPM();

		// Методы регистрации. Наблюдатели делятся на 2 группы
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
	////
}
