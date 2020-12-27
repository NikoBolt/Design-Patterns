package com.company._12_CombinePatterns._2_MVC._2_Controller;

	// Методы контроллера, которые могут вызываться представлением
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
