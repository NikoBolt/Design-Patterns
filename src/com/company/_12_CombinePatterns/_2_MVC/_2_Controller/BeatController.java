package com.company._12_CombinePatterns._2_MVC._2_Controller;

//import com.company._12_CombinePatterns._2_MVC._2_Controller.ControllerInterface;
import com.company._12_CombinePatterns._2_MVC._1_View.BeatModelInterface;
import com.company._12_CombinePatterns._2_MVC._1_View.DJView;

// Контроллер связывает объекты модели и представления
public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
   
	public BeatController(BeatModelInterface model) { // Получает модель в конструкторе и создает представление
		this.model = model;
		view = new DJView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
  
	public void start() {
		model.on();						// Активация модели
		view.disableStartMenuItem();	// блокировка кнопки старт
		view.enableStopMenuItem();		// кнопка стоп становится доступной
	}
  
	public void stop() {
		model.off();					// деактивация модели
		view.disableStopMenuItem();		// блокировка кнопки стоп
		view.enableStartMenuItem();		// кнопка старт становится доступной
	}

	// установка новой частоты
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
