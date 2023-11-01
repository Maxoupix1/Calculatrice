package controler;

import javafx.application.Application;
import javafx.stage.Stage;
import model.CalculatorModel;
import view.CalculatorGUI;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		CalculatorGUI vue = new CalculatorGUI();
		CalculatorModel modele = new CalculatorModel();
		Controler controler = new Controler(vue, modele);
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
