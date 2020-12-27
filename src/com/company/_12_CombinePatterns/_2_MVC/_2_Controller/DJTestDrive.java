package com.company._12_CombinePatterns._2_MVC._2_Controller;

//import com.company._12_CombinePatterns._2_MVC._2_Controller.BeatController;
//import com.company._12_CombinePatterns._2_MVC._2_Controller.ControllerInterface;
import com.company._12_CombinePatterns._2_MVC._1_View.BeatModel;
import com.company._12_CombinePatterns._2_MVC._1_View.BeatModelInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();         // Создаем модель
		ControllerInterface controller = new BeatController(model); // Создаем контроллер, а он сосздает представление
    }
}
